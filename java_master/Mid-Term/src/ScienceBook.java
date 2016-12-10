/**
 * Created by da vinci on 10/20/16.
 */

import javax.swing.JOptionPane;

public class ScienceBook extends Book
{
    public ScienceBook(String title, String ISBN, String publisher, double price, int year) {
        super(title, ISBN, publisher, price, year);
    }

    @Override
    public double setPrice(double price) {
        return (.1 * price);
    }

    @Override
    public String setGenre() {
        return "Science Book";
    }

}
