/**
 * Created by Miachelangelo di Lodovico  on 9/19/16.
 */

import java.util.Scanner;
import javax.swing.JOptionPane;

public class GameObject_Test {

    public static void main(String[] args) {

        // Putting default constructor values
        GameObject Object_Data = new GameObject(1.0, 2.0, 3.0, true, true);

        //Printing out the initial values for test purpose
        System.out.println(Object_Data.getX());
        System.out.println(Object_Data.getY());
        System.out.println(Object_Data.getVelocity());
        System.out.println(Object_Data.getState());
        System.out.println(Object_Data.getRotation());

        Scanner input = new Scanner(System.in);

        //Position X for Object
        double Position_X = Double.parseDouble((String)JOptionPane.showInputDialog("Enter Position X?"));
        JOptionPane.showMessageDialog(null,Position_X + "\nis the position of Object in X Coordinate.");

         //Postion Y for Object
         double Position_Y = Double.parseDouble((String)JOptionPane.showInputDialog("Enter Position Y?"));
         JOptionPane.showMessageDialog(null,Position_Y + "\nis the position of Object in Y Cordinate.");

        // Postion Velocity for Object
        double Velocity = Double.parseDouble((String)JOptionPane.showInputDialog("Enter Velocity of Object ?"));
        JOptionPane.showMessageDialog(null,Velocity + "\nis the Velocity of Object in m/s.");

        // State of the Object
        String state = JOptionPane.showInputDialog("Enter 'true' or 'false' for State of Object.");
        Boolean boolean_state = Boolean.valueOf(state); // converts the string true or false to actual boolean true or false
        JOptionPane.showMessageDialog(null,(boolean_state ? "Alive" : "Dead") + "\nis the state of Object."); // gives the state of Object as 'alive' or 'dead' depening on the boolean

        // Rotation of the Object
        String rotation = JOptionPane.showInputDialog("Enter 'true' or 'false' for State of Object.");
        Boolean boolean_rotation = Boolean.valueOf(state); // converts the string true or false to actual boolean true or false
        JOptionPane.showMessageDialog(null,(boolean_rotation ? "Clockwise" : "CounterClockwise") + "\nis the state of Object"); // gives the rotation  of Object as 'clockwise' or 'counterclockwise' depening on the boolean


    }
}
