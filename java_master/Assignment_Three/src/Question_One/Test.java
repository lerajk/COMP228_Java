package Question_One;

/**
 * Created by Da Vinci on 10/13/16.
 */
import java.util.Scanner;
public class Test
{

    public static void main(String[] args)
    {


        Health health_Object = new Health ("Health", 1.0);
        Life life_Object = new Life ("Life", 2.0);

        Insurance [] insurance_array = new Insurance [2];

        insurance_array[0] = health_Object;
        insurance_array[1] = life_Object;

        System.out.println("Initial Set Values are:");
        for (Insurance value : insurance_array)
        {
            System.out.println(value);
        }


        System.out.println("Enter type of Insurance:");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        String l = "Life";
        String h = "Health";

        if(l.equalsIgnoreCase(name))
        {
            System.out.println(life_Object.displayInfo());
        }
        else if (h.equalsIgnoreCase(name))
        {
            System.out.println(health_Object.displayInfo());

        }

    }


}
