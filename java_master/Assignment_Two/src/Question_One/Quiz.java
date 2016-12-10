package Question_One;

/**
 * Created by da vinci on 10/3/16.
 */

import javax.swing.JOptionPane;

public class Quiz {


    private int answer;
    private static int count = 0;

    public static int getCount() {
        return count;
    }

    public Quiz(int answer) {

        this.answer = answer;
    }


    public int getAnswer() {
        return answer;
    }

    public void getCorrectDisplay() {
        JOptionPane.showMessageDialog(null, "You are correct!");

    }

    public void getQuestion(String a, String b, String c, String d, String e) {

        JOptionPane.showMessageDialog(null, a + b + c + d + e);


    }

    public int getInput(int n){

        int n1 = Integer.parseInt((String)JOptionPane.showInputDialog("Pick you choice between: 1, 2, 3, 4, 5."));
        answer = n1;
        return n1 ;

    }

    public void getWrongDisplay(){

            JOptionPane.showMessageDialog(null, "You are Wrong!");


    }

    // have set the correct answer for each question to option 2.
    public void answerEvaluation() {

        if (answer == 2)
        {
            getCorrectDisplay();
            count++;

        } else
            {
                getWrongDisplay();

            }
    }

}




