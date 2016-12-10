package Question_One;

/**
 * Created by da vinci on 10/3/16.
 */
import javax.swing.JOptionPane;

public class Quiz_Test {

    public static void main(String[] args) {


        Quiz Q = new Quiz(0);
        JOptionPane.showMessageDialog(null, "Attempt each Question only ONCE in ORDER!\nThese are your list of Questions: 1 - 5\n1. How is an Object distinguised?\n2. What is a Class?\n3. How to call a method?\n4. What is Java?\n5. What does ALU do?");
        if ((Q.getInput(0)) > 6 )
        {

            JOptionPane.showMessageDialog(null, "Invalid Input");

        } else {


                while  (Q.getAnswer() < 6 )
                {


                    switch (Q.getAnswer())
                    {
                        case 1:

                            Q.getQuestion("How is an Object distinguised?", "\n1. Color", "\n2.Properties and Methods", "\n3.Class", "\n4.Variables");
                            Q.getInput(0);
                            Q.answerEvaluation();
                            break;

                        case 2:
                            Q.getQuestion("What is a Class?", "\n1. A classroom", "\n2.A Blueprint for Objects", "\n3.Symbol of Style", "\n4. an Object");
                            Q.getInput(0);
                            Q.answerEvaluation();
                            break;

                        case 3:
                            Q.getQuestion("How to call a method?", "\n1. Use a star", "\n2.Use a dot seperator", "\n3.Use the letter M", "\n4. Use #");
                            Q.getInput(0);
                            Q.answerEvaluation();
                            break;

                        case 4:
                            Q.getQuestion("What is Java?", "\n1. Coffee", "\n2.An OOP Langauge", "\n3.Javascript", "\n4.Language");
                            Q.getInput(0);
                            Q.answerEvaluation();
                            break;

                        case 5:
                            Q.getQuestion("What does ALU do?", "\n1. Processes data", "\n2.Performs simple calulations", "\n3.Stores Data", "\n4.Is an Object");
                            Q.getInput(0);
                            Q.answerEvaluation();
                            break;

                        default:
                            if(Q.getAnswer() == 9);
                            break;


                    }

                    //JOptionPane.showMessageDialog(null, "Attempt each Question only ONCE in ORDER!\nThese are your list of Questions: 1 - 5\n1. Color\n2. Car\n3. Coffee\n4. Phone\n5. Computer\nPress 9 to Exit when done.");
                    JOptionPane.showMessageDialog(null, "Attempt each Question only ONCE in ORDER!\nThese are your list of Questions: 1 - 5\n1. How is an Object distinguised?\n2. What is a Class?\n3. How to call a method?\n4. What is Java?\n5. What does ALU do?\nPress 9 to Exit when done.");

                    Q.getInput(0);


                }

           }

        JOptionPane.showMessageDialog(null, "Your correct answer ratio:\t" + Quiz.getCount() + " / 5");
        JOptionPane.showMessageDialog(null, "Your percentage is:\t" + (((Quiz.getCount())* 0.20) * 100) + "%");


    }


}
