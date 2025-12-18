import java.util.*;
public class RockPaperScissors
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter rock or paper or scissors : ");
        String user=sc.nextLine().toLowerCase();
        if(!((user.equals("rock")) || (user.equals("paper")) || (user.equals("scissors"))))
        {
            System.out.println("Please select any option of the three given options only.");
        }
        else
        {
            Random obj=new Random();
            int n=obj.nextInt(3);
            String comptr;
            if(n==0)
            comptr="rock";
            else if(n==1)
            comptr="paper";
            else
            comptr="scissors";
            System.out.printf("Computer has choosen \"%s\"\n",comptr);
            if(user.equals(comptr))
            System.out.println("It's a Tie!.Play again!!");
            else if( (user.equals("rock") && comptr.equals("scissors") )  ||
            ( user.equals("paper") && comptr.equals("rock") ) || ( user.equals("scissors") && comptr.equals("paper") ))
            {
                System.out.println("Yeah!You won the match!!");
            }
            else
            {
                System.out.println("You lost!!Better luck next time!!");
            }
        }
sc.close();
    }
}