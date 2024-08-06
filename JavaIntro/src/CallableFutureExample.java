import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) {

        //create an executor service
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        //creating a callable task
        Callable<Integer> task = () ->{
            Thread.sleep(1000);
            return 123;
        };

        Future<Integer> future = executorService.submit(task);

        try {
            Integer result = future.get();
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.getStackTrace();
        }

        executorService.shutdown();
    }
}
