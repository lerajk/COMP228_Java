import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by da vinci on 12/8/16.
 */


public class AccountTest
{
    public static void main(String[] args)
    {
        Account  account = new Account(100);
        // create and name each runnable
        Transaction task1 = new Transaction("withdraw", account);
        Transaction task2 = new Transaction("deposit", account);

        System.out.println("Starting Executor");

        // create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // start the three PrintTasks
        executorService.execute(task1); // start task1
        executorService.execute(task2); // start task2
        //executorService.execute(task3); // start task3

        // shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}
