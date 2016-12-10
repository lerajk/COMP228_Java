package Question_Three;

import java.util.Scanner;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public class Test_Mortgage
{
    public static void main(String[] args)
    {
        // initializing 0.2 and 0.1 interest rates in the constructors
        BusinessMortage BM = new BusinessMortage (1, "John", 1.0, 0.2, 1, 0.0);
        PersonalMortage PM = new PersonalMortage (2, "Mark", 100000.0, 0.1, 1,0.0);

        Mortgage [] mortgage_Array = new Mortgage [2];

        mortgage_Array[0] = BM;
        mortgage_Array[1] = PM;


        System.out.println("Initial Set Values are:");
        for (Mortgage value : mortgage_Array)
        {
            System.out.println(value);
        }

        for (int j = 0; j < mortgage_Array.length; j++)
        {
            // Tip: When running the code, enter all the values as "1" to see if the program is functional or not.
            System.out.println("Enter Mortage Number:");
            int mN =  BM.getInt();

            System.out.println("Enter Name:");
            String name = BM.getString();

            System.out.println("Enter Mortgage Amount:");
            double mA = BM.getDouble();

            System.out.println("Enter Lease Years:");
            int l =  BM.getInt();

            System.out.println("Enter Interest Rate:");
            double iR = BM.getDouble();


            if (j==0)
            {
                // creating new object to store the inputted values so that I can avoid using so many getters and setters.
                mortgage_Array[j] = new BusinessMortage (mN, name, mA, 0.2, l, BM.setInterest(iR));
                System.out.println("This is the new BUSINESS interest Value:" + BM.getInterest() + "\n");


            } else
            {
                mortgage_Array[j] = new PersonalMortage (mN, name, mA, 0.1, l, PM.setInterest(iR));
                System.out.println("This is the new PERSONAL interest Value:" + PM.getInterest());

            }

        }

        System.out.println("\nEdited Values for Mortgage:");
        for (Mortgage value : mortgage_Array)
        {
            System.out.println(value);
        }


    }

}
