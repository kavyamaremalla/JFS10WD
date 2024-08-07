import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFutureDemo {
    public static void main(String[] args) {

        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {//create
            try {// simulating some random computations
                Thread.sleep(1000);
            } catch (InterruptedException e) {
               e.getStackTrace();
            }
            return "From Completable Future!";
        });

        CompletableFuture<String> resultFuture = completableFuture
                .thenApply(result -> result + " & added result");// completion stage is attached to completable future

        try {
            String result = resultFuture.get();
            System.out.println("After execution result is " + result);
        } catch (InterruptedException | ExecutionException e) {
           e.getStackTrace();
        }
    }
}
