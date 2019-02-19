
/**
 * Fun game to play casualy with friends or in a casino.
 *
 * @author (Chandler Washington)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Craps
{
    // instance variables - replace the example below with your own

    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to play Craps (Y/n)?");
        String playGame = in.nextLine();
        while (playGame.substring(0,1).equalsIgnoreCase("y"))
        { 
            int rollValue = 0;
            int rollPointValue = 0; 
            Die craps = new Die();
            System.out.print("Press <Enter> to roll...");
            String pause = in.nextLine();
            rollValue = craps.roll();
            System.out.println("You rolled a " + rollValue);
            if(rollValue == 2 || rollValue == 3 || rollValue == 12)
            {
                System.out.println("Sorry unfortunatley you have lost the game");

            }

            else if(rollValue == 7 || rollValue == 11)
            {
                System.out.println("Congratulations you win!!!");
            }
            else
            {
                rollPointValue = rollValue;
                System.out.println("your point is now " + rollPointValue + " If you get this before you get a 7 you win!");
                System.out.print("Press <Enter> to roll...");
                pause = in.nextLine();
                rollValue = craps.roll();
                
                while(rollValue != rollPointValue && rollValue != 7)
                {
                    System.out.println("you rolled a " + rollValue);
                    System.out.print("Remember you're trying to roll a " + rollPointValue);
                    System.out.print("Press <Enter> to roll...");
                    pause = in.nextLine();
                    rollValue = craps.roll();
                }
                if(rollValue == rollPointValue)
                {
                    System.out.println("Congratulations you rolled a " + rollPointValue + " win!!!");
                }
                else if(rollValue == 7)
                {
                    System.out.println("Sorry you rolled a 7 unfortunatley you have lost the game");
                }
                 
            }
            System.out.print("Would you like to play Craps (Y/n)?");
                 playGame = in.nextLine();
          

        }
   
    }
}
