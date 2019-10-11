import java.util.Scanner;
public class EvenFibonacci{
	public static void main(String[] args){
		int limit=4_000_000;
		int a=0;
		int b=1;
		int sum;
		int add=0;
		while(b<limit){
			sum=a+b;	
			if(sum%2==0){
				add=add+sum;
			}
			a=b;
			b=sum;
			
		}
		System.out.println(add);
	}
}

