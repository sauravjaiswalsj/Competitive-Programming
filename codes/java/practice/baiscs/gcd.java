import java.util.Scanner;
public class gcd{
	public static void main(String[] agrs){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int m=cin.nextInt();
		System.out.println(GCD(Integer.max(n,m),Integer.min(n,m)));
	}
	public static int GCD(int a,int b){
		while(a%b!=0){
			int rem=a%b;
			a=b;
			b=rem;
		}
		return b;
	}
} 
