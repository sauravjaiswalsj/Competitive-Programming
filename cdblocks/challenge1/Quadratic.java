import java.util.*;
import java.lang.*;
public class Quadratic{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int a=cin.nextInt();
		int b=cin.nextInt();
		int c=cin.nextInt();
		int d=(b*b)-(4*a*c);
		if(d==0){
			System.out.println("Real and Equal");
			int x=(-b)/2*a;
			System.out.println(x+" "+x);
		}
		else if(d>0){
			System.out.println("Real and Distinct");
			int x=((-b)-(int)(Math.sqrt(d)))/2*a;
			int y=((-b)+(int)(Math.sqrt(d)))/2*a;
			System.out.println(x+" "+y);
		}
		else{
			System.out.println("Imaginary");
		}
	}
}
