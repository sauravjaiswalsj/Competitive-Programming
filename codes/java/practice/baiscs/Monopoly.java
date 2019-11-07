import java.util.*;
public class Monopoly{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		System.out.println(monopolyRoll());
	}
	/*
	 * Provides the results based on the dice rolling
	 * @returns the sum of both the dice
	 */
	public static int monopolyRoll(){
		int roll1=diceRoll(6);
		int roll2=diceRoll(6);
		int total=roll1+roll2;
		if(roll1==roll2){
			roll1=diceRoll(6);
			roll2=diceRoll(6);
			total=total+roll1+roll2;
		}
		return total;
	}
	/*
	 * Generatres the Random number between 1 to 6
	 * @param Takes number of sides of a dice
	 * @return the number generated for each throw
	 */
	public static int diceRoll(int sides){
		double num=Math.random()*6;
		int nu=(int)(num+1);
		System.out.println(nu);
		return nu;
	}
}
		
