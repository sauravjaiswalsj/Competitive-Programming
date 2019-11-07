import java.util.Scanner;
import java.lang.*;
public class newPrime{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if(prime(n))
			System.out.println("prime");
		else
			System.out.println("not prime");
	}
	public static boolean prime(int n){
		if(n%2==0)
			return false;
		for(int i=3;i<Math.sqrt(n);i++){
			if(n%i==0)
				return false;
		}
		return true;
	}
}
