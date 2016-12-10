package Question_Two;

/**
 * Created by da vicni on 10/4/16.
 */

import java.security.SecureRandom;

public class Lotto {

    private int[] Array = new int[3];


    // random number generator function
    public int Random(){

        SecureRandom randomNumber = new SecureRandom();
        int Number = 1 + randomNumber.nextInt(9);
        return Number;
    }

    // constructor for array
    public Lotto() {
        for(int i=0;i<Array.length;i++)
        {
            Array[i] = Random();
        }
    }


    // getter for the array
    public int[] getArray() {
        return Array;
    }
}

