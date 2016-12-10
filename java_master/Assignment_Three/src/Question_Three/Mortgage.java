package Question_Three;

/**
 * Created by Michaelangelo on 10/14/16.
 * Sculpture Name: Head of a Faun
 */
public abstract class Mortgage {

    private final String bankName = "RBC";
    private final double maximumMortage = 300000;
    private int mortgageNumber;
    private String customerName;
    private double amountMortgage;
    private double interestRate;
    private int term;

    // ToString Method
    @Override
    public String toString() {
        return (bankName + " \n" + maximumMortage + " \n" + mortgageNumber + " \n" + customerName + " \n" + amountMortgage + " \n" + interestRate + " \n" + term +"\n\n");
    }


    // Getter for Interest Rate
    public double getInterestRate() {
        return interestRate;
    }

    // Constructor
    public Mortgage(int mortgageNumber, String customerName, double amountMortgage, double interestRate, int term)
    {

        if (mortgageNumber > 300000)
            throw new IllegalArgumentException("Mortgage Number has to be less than $300000.");
        this.mortgageNumber = mortgageNumber;

        this.customerName = customerName;

        this.amountMortgage = amountMortgage;

        this.interestRate = interestRate;

        switch(term)
        {
            case 1:
                this.term = 1;
                System.out.println("Your Morgage is SHORT");
                break;

            case 3:
                this.term = 3;
                System.out.println("Your Morgage is MEDIUM");
                break;

            case 5:
                this.term = 5;
                System.out.println("Your Morgage is LONG");
                break;

            default:
                this.term = 1;
                System.out.println("Your Morgage is set to SHORT-TERM 1 YEAR LOAN:");


        }


    }
}
