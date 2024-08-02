public class Main extends Thread{

    public void run() {
        System.out.println("Running in Main thread");
    }

//    public static void main(String[] args) { // implements Runnable
//        Main object = new Main();
//        Thread thread = new Thread(object);
//
////        object.start();
//        thread.start();
//        System.out.println("Outside thread");
//    }

    public static void main(String[] args) {
        Main object = new Main();

//        object.run();

        object.start();//already it's parent is thread

        System.out.println("Outside thread");
    }
}
