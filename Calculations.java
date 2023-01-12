
import java.util.*; 


public class Calculations //This is the logic behind the 3 questions that are asked and how they are generated.
{
    int random1;
    int random2;
    int answer;

    public void quizQuestion(String operand)//Pass the operand based on the selection of the user 
    {
       
        random1 = (int)(Math.random() * 12);//select a random number - need to multiply by 12 or it will generate 0 always.
        random2 = (int)(Math.random() * 12);//select a random number - need to multiply by 12 or it will generate 0 always.
   
        if (operand.equals("+"))//if the type of problem is addition
        	answer = random1 + random2;
        else if (operand.equals("-"))//if the type of problem is subtraction
        	answer = random1 - random2;
    }

    public int[] getRandomNums()//retrieves the 2 random numbers (stored as an array)
    {
       return new int[]{random1, random2};
    }

   public int retrieveAnswer() //retrieves the answer
    {
        return answer;
    }
    public boolean checkAnswer(int guess)//confirms if the answer is right by taking the guess from the user and comparing it
    									  //to this answer based on the calculation above.
    {
        if (this.answer == guess)//if the answer equals the inputed guess by the user
            return true;
        else
        return false;
    }

}