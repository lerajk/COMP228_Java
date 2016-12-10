import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by da Vinci on 12/8/16.
 */

public class AccountTest_Two
{
    public static void main(String[] args)
    {
        Account  account = new Account(100);
        // create and name each runnable
        Transaction task1 = new Transaction("withdraw", account);
        Transaction task2 = new Transaction("deposit", account);
        Transaction task3 = new Transaction("deposit", account);


        List<Transaction> list = new ArrayList<Transaction>();
        list.add(task1);
        list.add(task2);
        list.add(task3);
        //list.add(new Transaction("Desposit", account));



        System.out.println("Starting Executor");

        // create ExecutorService to manage threads
        ExecutorService executorService = Executors.newCachedThreadPool();

        // start the three PrintTasks
        for (Transaction T : list)
        executorService.execute(T); // start task1
        //executorService.execute(task2); // start task1
        //executorService.execute(task3); // start task1




        for (int count = 0; count < list.size(); count++)
            System.out.printf("%s ", list.get(count));

        // shut down ExecutorService--it decides when to shut down threads
        executorService.shutdown();

        System.out.printf("Tasks started, main ends.%n%n");
    }
}

