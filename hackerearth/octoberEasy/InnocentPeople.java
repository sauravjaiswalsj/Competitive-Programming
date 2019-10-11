import java.util.*;
import java.lang.*;
public class InnocentPeople{
	public static void main(String[] args) throws Exception{
		Scanner cin= new Scanner(System.in);
		//String vowels={"A","E","I","O","U","Y"};
		String vowels = "A E I O U Y";
		String input=cin.nextLine();
		String c=String.valueOf(input.charAt(2));	
		boolean h=vowels.contains(c);
		//System.out.println(h);
		
		if(h==true){
			System.out.println("invalid");
		}
		else{
			consecutiveSum(input);
		}

	}
	public static void consecutiveSum(String inp){
		int sum,count =0;
		int x = inp.length();
		for(int i=1;i<x;i++){
			sum=inp.charAt(i-1)+inp.charAt(i);
				if(sum%2==0){
					sum =0;
					count++;
				}
			}
			if(count>0){
				System.out.println("invalid");
			}
			else{
				System.out.println("valid");
			}
		}
}