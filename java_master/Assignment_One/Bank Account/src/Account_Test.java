/**
 * Created by Michaelangelo di Lodovico on 9/19/16.
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Account_Test
{
    public static void main(String[] args)
    {
        Account account1 = new Account("Leonardo da Vinci", 50.00);

        // Using GUI to Display
        JOptionPane.showMessageDialog(null,account1.getName() + "\nbalance in Canadian $ is" + "  " + account1.getConvertBalance());


        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);


        // add $ to account1 with GUI
        double depositAmount = Double.parseDouble((String)JOptionPane.showInputDialog("Enter New Deposit Amount for Leonardo da Vinci?"));

        // display adding balance to account1 with GUI
        JOptionPane.showMessageDialog(null,"$" + depositAmount + "\nis being added to Leonardo da Vinci's Account.");
        account1.deposit(depositAmount); // add to account's balance

        //display balance with GUI
        JOptionPane.showMessageDialog(null,account1.getName() + "\nbalance in Canadian $ is" + "  " + account1.getConvertBalance());


        // withdraw $ from account1 with GUI
        double withdrawAmount = Double.parseDouble((String)JOptionPane.showInputDialog("Enter New Withdrawl Amount for Leonardo da Vinci?"));
        account1.withdraw(withdrawAmount);


        // display withdrawing balance to account1 with GUI
        JOptionPane.showMessageDialog(null,"$" + withdrawAmount + "\nis being taken away from Leonardo da Vinci's Account.");

        //display balance with GUI
        JOptionPane.showMessageDialog(null,account1.getName() + "\nbalance in Canadian $ is" + "  " + account1.getConvertBalance());


    } // end main
} // end class AccountTest
