package Question_One;

/**
 * Created by Da Vinci on 10/13/16.
 * Painting name: The Annunciation
 */

public abstract class Insurance {

    private String InsuranceType;
    private double InsuranceCost;

    // constructor
    public Insurance(String insuranceType, double monthyCost) {

        this.InsuranceType = insuranceType;
        this.InsuranceCost = monthyCost;

    }

    // Getter for InsuranceType
    public String getInsuranceType() {
        return InsuranceType;
    }

    // Getter for MonthlyCost
    public double getMonthyCost() {
        return InsuranceCost;
    }

    // Setter for abstract method  setInsuranceCost()
    public abstract double setInsuranceCost();

    // Setter for abstract method  displayInfo()
    public abstract String displayInfo();

    // to string

    @Override
    public String toString() {
        return  (InsuranceType + "  " + InsuranceCost);
    }


}
