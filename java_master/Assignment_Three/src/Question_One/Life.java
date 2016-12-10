package Question_One;

import java.util.Scanner;

/**
 * Created by Da Vinci on 10/13/16.
 */
public class Life extends Insurance{

    public Life(String insuranceType, double monthyCost) {
        super(insuranceType, monthyCost);
    }

    @Override
    public double setInsuranceCost()
    {

        System.out.println("Enter Monthy cost of LIFE Insurance:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        System.out.println("Your Monthly LIFE INSURANCE Cost:");
        return n;
    }

    @Override
    public String displayInfo() {
        return Double.toString(setInsuranceCost());
    }


}
