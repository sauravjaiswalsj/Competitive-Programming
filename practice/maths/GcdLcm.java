//a*b=lcm*gcd
import java.util.Scanner;
import java.math.*;
public class GcdLcm{
	public static void main(String[] args){
		final Scanner cin = new Scanner(System.in);
		int testCase=cin.nextInt();
		for(int i=0;i<testCase;i++){
			long a=cin.nextLong();
			long b=cin.nextLong();
			long gcd=findGcd(Math.max(a,b),Math.min(a,b));
			long lcm=getLcm(gcd,a,b);
			System.out.println(lcm+" "+gcd);
		}
	}
	private static long findGcd(long a,long b){
		if(b==0){
			return a;
		}
		return findGcd(b,a%b);
	}
	private static long getLcm(long gcd,long a,long b){
		return ((a*b)/gcd);
	}
}
	
