import java.util.Random;
import java.util.Scanner;

/**
 * @author Thato Masike
 */

public class Main {
	

	public static void main(String[] args)
	{
		
		Startgame();
				
	}

		
		public static void Startgame() 
		{
			Random rand = new Random();
			Scanner scanner = new Scanner(System.in);
			int randomNumber = rand.nextInt(100)+1;
			int wonRounds =0;
			
			int attempt = 5;
			
			
			do{
				System.out.println("Welcome to the Guessing Number Game!!");
			
				System.out.println("Enter your guess (1-100)");
			
				
				System.out.println("you have "+ attempt+"(s) left");
			
			int playerGuess = scanner.nextInt();
			
			if(playerGuess == randomNumber)
			{
				
				System.out.println("you got right, you win");
				wonRounds++;
				break;
			}
			else if(randomNumber > playerGuess)
			{
				System.out.println("the number is higher, try again");
			}
			else
			{
				System.out.println("the number is lower");
			}
			attempt--;
			if(attempt == 0)
			{
				System.out.println("You are out of attempts, you lose sorry");
				System.out.println("the random number was "+randomNumber);
				break;
			}
			
			}
			while(attempt > 0);
		
			System.out.println("Do you want to try again?? \n1.go again \n2.I quit");
			int choice;
			choice =scanner.nextInt();
			if(choice ==1) 
			{
				System.out.println("you won "+wonRounds+" round(s) so far");
				Startgame();
			}
			if(choice == 2)
			{	
				System.out.println("Awww I hope we play again soon. Goodbye");
				System.out.println("congrats, you won "+ wonRounds+ " round(s)");
			}
	}
}
