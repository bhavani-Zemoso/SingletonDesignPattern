import java.util.concurrent.ExecutorService;

public class ExecuteTaskAllocator {

    public static void main(String[] args) {
        ExecutorService allocator1 = TaskAllocator.createExecutorService();
        ExecutorService allocator2 = TaskAllocator.createExecutorService();

        System.out.println(allocator1.hashCode());
        System.out.println(allocator2.hashCode());

        if(allocator1 == allocator2) {
            System.out.println("Same");
        }

    }
}
