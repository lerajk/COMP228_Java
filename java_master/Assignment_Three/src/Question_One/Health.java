package Question_One;

import java.util.Scanner;

/**
 * Created by Da Vinci on 10/13/16.
 */
public class Health extends Insurance {

     // calling constructor of super or parent class
    public Health(String insuranceType, double monthyCost) {
        super(insuranceType, monthyCost);
    }

    @Override
    public double setInsuranceCost() {
        System.out.println("Enter Monthy cost of HEALTH Insurance:");
        Scanner input = new Scanner(System.in);
        double n = input.nextDouble();
        System.out.println("Your Monthly HEALTH INSURANCE Cost:");
        return n;
    }

    @Override
    public String displayInfo() {
        return Double.toString(setInsuranceCost());
    }

}
