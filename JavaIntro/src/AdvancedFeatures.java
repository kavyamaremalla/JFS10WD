import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AdvancedFeatures {
    public static void main(String[] args) {
        Scanner scanner = null;

        try(scanner) { //send object to try block from Java 9
            new Scanner(new File("test.txt"));
            System.out.println("inside try block");

        } catch (FileNotFoundException e) {
            System.out.println( e.getMessage());
//            scanner.close();//explicitly calling scanner.close even if it's in catch block from Java7
        }
    }
}

class AutoCloseableImpl {//from Java 9
    public static void main(String[] args) {
        AutoCloseable closeable =() -> {
            //logic
            System.out.println("Object is closed");
        };

//        closeable.close();

        try(closeable) {
            System.out.println("From try block");
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
