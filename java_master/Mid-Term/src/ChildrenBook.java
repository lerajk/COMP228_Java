/**
 * Created by da vinci on 10/20/16.
 */
public class ChildrenBook extends Book {

    public ChildrenBook(String title, String ISBN, String publisher, double price, int year)
    {
        super(title, ISBN, publisher, price, year);
    }

    @Override
    public double setPrice(double price) {
        return price;
    }

    @Override
    public String setGenre() {
        return "Children Book";
    }
}
