/** The game needs to generate a random number between 0 - 9
 *  There will be 3 players
 *  Each player will have to guess the randomly generated number
 *  The player who guess the number will win
 */

import java.util.*;
public class GuessingGame {
	public static void main(String[] args) {
		GuessGame game=new GuessGame();
		game.playGame();
	}//main ends
}//class ends

class Player {
	int number=0;
	public void guess() {
		number=(int)(Math.random()*10);
		System.out.println("I am guessing the number:" +number);
	}//methods ends
}//class ends

class GuessGame {
	// Declare the three instances of the player
	Player p1;
	Player p2;
	Player p3;

	public void playGame() {
		p1=new Player();
		p2=new Player();
		p3=new Player();

		int guessp1=0, guessp2=0,guessp3=0;
		boolean p1right=false, p2right=false, p3right=false;

		// set the target number 
		int targetNumber= (int)(Math.random()*10);
		System.out.println("Please Guess the number between 0 to 9");

		while(true){
			System.out.println("Number to guess is "+targetNumber);
			// guess the number for each player
			p1.guess();
			p2.guess();
			p3.guess();

			//assign the number to each player and print the guessed number
			guessp1=p1.number;
			System.out.println("I am guessing the number :"+guessp1);

			guessp2=p2.number;
			System.out.println("I am guessing the number :"+guessp2);

			guessp3=p3.number;
			System.out.println("I am guessing the number :"+guessp3);

			//to check whether the guessed number is true or not

			if(guessp1==targetNumber){
				p1right=true;
			}//if ends
			if(guessp2==targetNumber){
				p2right=true;
			}//if ends
			if(guessp3==targetNumber){
				p3right=true;
			}//if ends
			if(p1right || p2right || p3right){
				System.out.println("We have a winner");
				System.out.println("Player one got it right? "+p1right);
				System.out.println("Player two got it right? "+p2right);
				System.out.println("Player three got it right?"+p3right);
				System.out.println("Game is over");
				break;
			}//if ends
			else{
				System.out.println("Players will have to guess again:");
			}//else ends
		}// while ends
	}// methods ends
}//class ends
