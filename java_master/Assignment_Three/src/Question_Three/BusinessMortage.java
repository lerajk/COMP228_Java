package Question_Three;

import java.util.Scanner;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public class BusinessMortage extends Mortgage
{
    private double interest;

    public BusinessMortage(int mortgageNumber, String customerName, double amountMortgage, double interestRate, int term, double interest)
    {
        super(mortgageNumber, customerName, amountMortgage, interestRate, term);

        this.interest = interest;
    }

    public int getInt()
    {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        return number;
    }

    public double getDouble()
    {
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();
        return number;
    }

    public String getString()
    {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        return name;
    }

    public double getInterest()
    {
        return (getInterestRate() + interest);
    }

    public double setInterest(double interest)
    {
        return this.interest = interest;
    }
}

