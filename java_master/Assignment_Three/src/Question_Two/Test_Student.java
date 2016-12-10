package Question_Two;

import Question_One.Health;
import Question_One.Life;

import java.util.Scanner;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public class Test_Student {

    public static void main(String[] args)

    {
        FullTime fullStudent = new FullTime ("Full-Time", true);
        PartTime partStudent = new PartTime ("Part-Time", false);

        Student [] student_Array = new Student [2];

        student_Array[0] = fullStudent;
        student_Array[1] = partStudent;

        System.out.println("Initial Set Values are:");
        for (Student value : student_Array)
        {
            System.out.println(value);
        }

        System.out.println("Enter Student Status Type as FullTime or PartTime:\n");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        String f = "FullTime";
        String p = "PartTime";

        if(f.equalsIgnoreCase(name))
        {
            System.out.println(fullStudent.fees());
        }
        else if (p.equalsIgnoreCase(name))
        {
            System.out.println(partStudent.fees());

        }



    }
}
