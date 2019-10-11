import java.util.*;
public class Probelem1{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		int n=cin.nextInt();
		// total students
		int sum=(a-c)+(b-c)+c;
		if(n-sum==0){
			System.out.println("-1");
		}
		else if(n<sum){
			System.out.println("-1");
		}
		else{
			System.out.println(n-sum);
		}
		
	}
}
