/**
 * Created by Michaelangelo di Lodovico  on 9/19/16.
 */
public class Patient {
    // patient id, first name, last name, address, city, province, postal code

    private String Patient_Id;
    private String First_Name;
    private String Last_Name;
    private String Address;
    private String City;
    private String Province;
    private String Postal_Code;

    // Initializaing Constructor

    public Patient(String Patient_Id, String First_Name, String Last_Name,String Address,String City,String Province,String Postal_Code) {
        this.Patient_Id = Patient_Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.City = City;
        this.Province = Province;
        this.Postal_Code = Postal_Code;
    }

    //Providing getter method

    public String getPatient_Info()
    {
        return ("ID:  "  + Patient_Id + "\nFirst Name:  "  + First_Name  + "\nLast Name:  " + Last_Name + "\nAddess:  " + Address  + "\nCity:  " + City + "\nProvince:  " +  Province + "\nPostal:  " + Postal_Code);

    }

    //Providing the setter method

    public void setPatient_Info(String Patient_Id, String First_Name,String Last_Name,String Address,String City, String Province,String Postal_Code){

        this.Patient_Id = Patient_Id;
        this.First_Name = First_Name;
        this.Last_Name = Last_Name;
        this.Address = Address;
        this.City = City;
        this.Province = Province;
        this.Postal_Code = Postal_Code;

    }


}
