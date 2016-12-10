package Question_Three;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public class PersonalMortage extends Mortgage
{
    private double interest;

    public PersonalMortage(int mortgageNumber, String customerName, double amountMortgage, double interestRate, int term, double interest)
    {
        super(mortgageNumber, customerName, amountMortgage, interestRate, term);

        this.interest = interest;

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
