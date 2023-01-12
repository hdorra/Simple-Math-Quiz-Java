import javax.swing.*;
import java.awt.*;


public class QuizGUI extends JFrame //the GUI for the quiz quizQuestion with the numbers
{
    JPanel quesPopUp = new JPanel();
    QuizCard quizQuestion;//New instance of QuizCard
    
    public QuizGUI(int numberOne, int numberTwo, String operand)//pass through the numbers and the operand.
    {
        super("Quiz Card");//Name/Title of the window
        
        setSize(225, 300);//Size of the overall quiz question window.
        this.setBackground(Color.YELLOW);//Makes the window yellow.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Can close the window.

        quizQuestion = new QuizCard(numberOne, numberTwo, operand);//defining the numbers and operand that will show up on the screen
        															//from a new instance of QuizCard
        add(quizQuestion);//Add the 2 numbers and operand on the screen

        setVisible(true);//Making sure it is visible
      
    }
    
    public void inputtedAnswer(int guess)
    {
        quizQuestion.inputtedAnswer(guess);
 
    }
    
}