import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TaskAllocator {

    static ExecutorService executorService = null;
    private TaskAllocator() {}

    public static ExecutorService createExecutorService() {

        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(10);

            Runnable runnableTask = () -> {
                try {
                    System.out.println("Executing task");
                }
                catch (Exception e) {
                    e.printStackTrace();
                }
            };

            executorService.execute(runnableTask);

        }
        return executorService;
    }
}
