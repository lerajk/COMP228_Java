/**
 * Created by Michaelangelo di Lodovico  on 9/19/16.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Patient_Test {

    public static void main(String[] args) {

        // Putting default constructor values
        Patient Patient_Data = new Patient("ABC","Leonardo"," Da Vinci", " Republic of Florence", "Rome","Italy","XYZ" );
        System.out.println(Patient_Data.getPatient_Info());

        Scanner input = new Scanner(System.in);

        System.out.print("Patient Number: ");
        String Patient_Number = input.nextLine(); // obtain Patient Number

        System.out.print("Patient Name First: ");
        String Patient_Name_First = input.nextLine(); //obtain First Name

        System.out.print("Patient Name Last: ");
        String Patient_Name_Last = input.nextLine(); //obtain Last Name


        System.out.print("Patient Address : ");
        String Patient_Address = input.nextLine(); //obtain Address

        System.out.print("Patient City : ");
        String Patient_City = input.nextLine(); //obtain City

        System.out.print("Patient Province : ");
        String Patient_Province = input.nextLine(); //obtain Province

        System.out.print("Patient Postal : ");
        String Patient_Postal = input.nextLine(); //obtain Postal



        Patient_Data.setPatient_Info(Patient_Number, Patient_Name_First, Patient_Name_Last, Patient_Address, Patient_City,Patient_Province, Patient_Postal );
        System.out.println(Patient_Data.getPatient_Info());

        JOptionPane.showMessageDialog(null, Patient_Data.getPatient_Info());

    }

}
