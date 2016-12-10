/**
 * Created by da vinci on 10/20/16.
 */

import javax.swing.JOptionPane;


public class BookTest
{
    public static void main(String[] args)
    {
        ScienceBook book1 = new ScienceBook ("Origin of Species", "12345", "Foothill Inc", 99, 1800);
        ChildrenBook book2 = new ChildrenBook ("Cosmos", "54321", "Cyfro Inc", 1, 1991);

        Book [] book_Array = new Book [2];

        book_Array[0] = book1;
        book_Array[1] = book2;

        // Print out initial values in console
        System.out.println("Initial Set Values are:");
        for (Book value : book_Array)
        {
            System.out.println(value);
        }

        String n1 = (String)JOptionPane.showInputDialog("Enter Book Type as Science or Children:\n");


        String s = "Science";
        String c = "Children";

        if(s.equalsIgnoreCase(n1))
        {
            //get input
            String isbn = (String)JOptionPane.showInputDialog("Enter ISBN:\n");
            String publisher = (String)JOptionPane.showInputDialog("Enter Publisher:\n");
            double price = Double.parseDouble((String)JOptionPane.showInputDialog("Enter Price:\n"));
            int year = Integer.parseInt((String)JOptionPane.showInputDialog("Enter Year:\n"));

            //Display Input
            JOptionPane.showMessageDialog(null,isbn + " \n" + publisher + " \n" + "10% discount price: " + book1.setPrice(price) + " \n" + year + " \n" + "Genre Return: " + book1.setGenre());


        }
        else if (c.equalsIgnoreCase(n1))
        {

            //get input
            String isbn = (String)JOptionPane.showInputDialog("Enter ISBN:\n");
            String publisher = (String)JOptionPane.showInputDialog("Enter Publisher:\n");
            double price = Double.parseDouble((String)JOptionPane.showInputDialog("Enter Price:\n"));
            int year = Integer.parseInt((String)JOptionPane.showInputDialog("Enter Year:\n"));

            //Display Input
            JOptionPane.showMessageDialog(null,isbn + " \n" + publisher + " \n" + "User set Price: " + book2.setPrice(price) + " \n" + year + " \n" + "Genre Return: " + book2.setGenre());



        }






    }
}
