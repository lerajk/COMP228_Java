package Question_Two;

/**
 * Created by da vinci on 10/4/16.
 */

import javax.swing.JOptionPane;

public class Lotto_Test {

    public static void main(String[] args) {

        int sum = 0;
        Lotto lotto = new Lotto();
        int[] array = lotto.getArray();

        /* prints the random value of arrays in the console */
        for (int value : array)
            System.out.printf("   %d", value);
        System.out.println();


        for(int i=0;i<array.length;i++)
        {
            sum += array[i] ;
        }

        /* prints the sum of the random values, to help you cheat and win the game*/
        System.out.println(sum);

        int loop = 0;
        while (loop < 5) {

            int n1 = Integer.parseInt((String)JOptionPane.showInputDialog("Pick you choice between: 3 - 27."));
            if(sum == n1) {

                JOptionPane.showMessageDialog(null, "You Win. You saved Humanity!");
                loop = 6;

            } else {

                JOptionPane.showMessageDialog(null, "Try Again!");
                loop++;

            }

        }

        if (loop != 6) {

            JOptionPane.showMessageDialog(null, "IBM Won! This is sad.");

        }



    }
}

