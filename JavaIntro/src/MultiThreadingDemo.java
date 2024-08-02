import java.util.Date;

public class MultiThreadingDemo {
    public static void main(String[] args) {
        SharedResource  sharedResource = new SharedResource();
        NumberThread numberThread = new NumberThread(sharedResource);
        LetterThread letterThread = new LetterThread(sharedResource);

        numberThread.start();
        letterThread.start();
    }
}

class NumberThread extends Thread{

    private SharedResource sharedResource;

    public NumberThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run() {
        for (int i = 1 ; i <= 5; i ++){
            sharedResource.printNumber(i);
            try {
                Thread.sleep(2000); //2 seconds or 2000 milli seconds
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

class LetterThread extends Thread{

    private SharedResource sharedResource;

    public LetterThread(SharedResource sharedResource){
        this.sharedResource = sharedResource;
    }

    public void run() {

        for (char c = 'A'; c <= 'E'; c ++){
            sharedResource.printLetter(c);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}

class SharedResource {
    private boolean isNumberTurn = true;

    public synchronized void printNumber(int number){
        while (!isNumberTurn){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(number);
        isNumberTurn = false;
        notifyAll();
    }

    public synchronized void printLetter(char letter){
        while (isNumberTurn){
            try {
                wait();
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(letter);
        isNumberTurn = true;
        notifyAll();
    }
}
