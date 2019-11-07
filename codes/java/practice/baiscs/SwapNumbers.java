import java.util.*;

public class SwapNumbers{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int num1=cin.nextInt();
		int num2=cin.nextInt();
		swap(num1,num2);
	}
	public static void swap(int num1,int num2){
		int t;
		t=num1;
		num1=num2;
		num2=t;
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
}
