import java.util.Scanner;
import java.lang.*;
public class fibnocci{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		//fibnocciSe(n);
		System.out.println(fibFormula(n));
		//System.out.println(fibrec(n));
	}
	public static void fibnocciSe(int n){
		int a=0,b=1,sum=0;
		System.out.println(a+"\n"+b);
		for(int i=1;i<=n-2;i++){
			sum=a+b;
			System.out.println(sum);
			a=b;
			b=sum;
		}
	}
	public static int fibrec(int n){
		if(n<=1)
			return n;
		else{
			return fibrec(n-1)+fibrec(n-2);
		}
	}
	public static int fibFormula(int n){
		double d=Math.sqrt(5);
		//System.out.println(d);
		double sum=(int)Math.pow(((d+1)/2),n);
		double total=sum/d;

		//System.out.println(sum+""+total);
		return (int)Math.ceil(total);
	}
}	
