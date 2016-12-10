/**
 * Created by da Vinci on 10/20/16.
 * Painting Name: The Last Supper
 *
 * LeenoyRajkhowa_COMP228_005Test
 */
public abstract class Book
{
    String title;
    String ISBN;
    String publisher;
    double price;
    int year;

    public Book(String title, String ISBN, String publisher, double price, int year)
    {
        this.title = title;
        this.ISBN = ISBN;
        this.publisher = publisher;
        this.price = price;
        this.year = year;
    }

    @Override
    public String toString() {
        return (title + " " + ISBN + " " + publisher + " " + price + " " + year);
    }

    public abstract double setPrice(double price);

    public abstract String setGenre();


}

