package Question_Two;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public class FullTime extends Student {

    public FullTime(String nameStatus, boolean status)
    {
        super(nameStatus, status);
    }

    @Override
    public int fees()
    {
        System.out.println("Your FULL TIME STUDENT FEES is:");
        return 2000;
    }
}
