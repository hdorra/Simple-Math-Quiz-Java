//This class has the instructions that generates the number of problems and messages based on answers inputed by the user.
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class CalculationsEvt implements ActionListener, ItemListener //handles all the events associated with the user entering
																//in their answer and the dialogue window that compares the answers.
{
    MainScreenGUI currScreen;//A new instance of the Main screen GUI - where you select which type of problem (add/subtract)

    Calculations currCalc = new Calculations();//Calls a new instance of a calculations class
    String operand;//the + or - operand

    public CalculationsEvt(MainScreenGUI currScreen)
    {
        this.currScreen = currScreen;//sets the current screen.
        operand = "+";//default operand at +.
    }


    public void actionPerformed(ActionEvent actualEvent)//initiates the new quiz card
    {
    	int problemNumber = 3;//number of questions that will be generated.

            for(int i = 0; i < problemNumber; i++)//iterates for each problem to show the right message dialogue based on the guess
            {
                currCalc.quizQuestion(operand);//calls the new problem in the Calculations class based on the add or subtract
                int[] selectedNumbers = currCalc.getRandomNums();//array of the selectedNumbers for the math problem (the 2 on the quiz chart)
                QuizGUI confirm = new QuizGUI(selectedNumbers[0], selectedNumbers[1], operand);
                int guess = Integer.parseInt(JOptionPane.showInputDialog("What do you think the answer is?: "));//captures the guess from user
                 
                confirm.inputtedAnswer(currCalc.retrieveAnswer());
                    
                	if (currCalc.checkAnswer(guess))
                        JOptionPane.showMessageDialog(currScreen, "You are Correct!:-)");//If the guess is right
                    else
                        JOptionPane.showMessageDialog(currScreen, "Sorry! Wrong Answer!:-(");//If the guess is not right
               
                confirm.dispose();//Get rid of the instance
            }

            JOptionPane.showMessageDialog(currScreen, "Let's Try Some More!");//Message box to try some more questions.

            currScreen.add.setEnabled(true);//resets the main box selection after the dialogue message
            currScreen.subtract.setEnabled(true);//resets the main box selection after the dialogue message
            currScreen.start.setEnabled(true);//resets the main box selection after the dialogue message
        }
 

   public void itemStateChanged(ItemEvent actualEvent)//Refreshes the new selection (if changed from + to - or vice versa).
    {
        if (actualEvent.getSource() == currScreen.add)
            operand = "+";
        else if (actualEvent.getSource() == currScreen.subtract)
          operand = "-";

   }
}