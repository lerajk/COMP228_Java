package Question_Two;

/**
 * Created by Michaelangelo on 10/14/16.
 */
public abstract class Student {

    private final String nameStatus;
    private boolean status;

    public Student(String nameStatus, boolean status)
    {
        this.nameStatus = nameStatus;
        this.status = status;
    }

    @Override
    public String toString() {
        return (nameStatus + "  " + status);
    }

    public abstract int fees();

}
