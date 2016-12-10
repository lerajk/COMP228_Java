package Question_Two;

import java.util.Scanner;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public class PartTime extends Student{

    public PartTime(String nameStatus, boolean status) {
        super(nameStatus, status);
    }

    @Override
    public int fees()
    {
        System.out.println("Enter your PART TIME credit hours:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println("Your PART TIME FEES is:");
        return n * 100;
    }
}
