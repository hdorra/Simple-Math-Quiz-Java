//This separates the actual content on the quiz popup card with the GUI (the centering/color, etc from the QuizGUI). 
//This is the JPanel that the quiz card sits in when it pops up.
import javax.swing.*;
import java.awt.*;

public class QuizCard extends JPanel
{
   int numberOne;
   int numberTwo;
   int guess;
   String operand;

    public QuizCard(int numberOne, int numberTwo, String operand)
    {
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
        this.operand = operand;
    }

    public void inputtedAnswer(int guess)
    {
        this.guess = guess;//What the user enters as a guess.
    }
    public void paintComponent(Graphics backdrop)//Defines the placement of the numbers on the quiz pop-up window.
    {
        Graphics2D questionDesign = (Graphics2D)backdrop;//new instance of the graphic
        questionDesign.setFont(new Font("Calibri", Font.ITALIC, 36));//updated and make italic
        questionDesign.drawString(numberOne + "", 75, 50); //Where the first number is placed on the popup card
        questionDesign.drawString(numberTwo + "", 75, 150); //Where the second number is placed on the popup card
        questionDesign.drawString("__", 70, 175); 
        questionDesign.drawString(operand, 15, 100);
    }
}