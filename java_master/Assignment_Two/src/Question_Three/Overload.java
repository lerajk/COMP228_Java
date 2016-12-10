package Question_Three;

/**
 * Created by da vinci on 10/3/16.
 */
public class Overload {

    public static void main(String[] args) {

        area(5); // area of square
        area(5, 6); // area of rectangle
        area(4.4); // area of circle


    }

    private static void area(int a) {
        int area = a * a;
        System.out.println(area);

    }

    private static void area(int a, int b)

    {
        int area = a * b;
        System.out.println(area);
    }

    private static void area(double a) {
        double area = 3.15 * a * a;
        System.out.println(area);
    }

}


