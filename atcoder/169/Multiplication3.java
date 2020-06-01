import java.util.Scanner;
import java.math.*;
public class Multiplication3{
	public static void main(String[] args){
		final Scanner cin=new Scanner(System.in);
		long a=cin.nextLong();
		double b=cin.nextDouble();
		long k=(long)Math.round(b*100);
		long mul=(a*k);
		System.out.print(mul/100);
	}
}
