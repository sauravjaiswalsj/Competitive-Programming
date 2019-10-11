import java.util.*;
import java.lang.*;
public class AnyBase{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		System.out.println("Enter the Num : ");
		int n=cin.nextInt();
		System.out.println("Enter the Source base: ");
		int sb=cin.nextInt();
		System.out.println("Enter the Destination Base: ");
		int db=cin.nextInt();
		System.out.println(ToAnyBase(n,sb,db));
	}
	public static int ToAnyBase(int n,int sb,int db){
		int sum=0,i=0;
		while(n!=0){
			int rem=n%db;
			sum=sum+(rem*(int)(Math.pow(sb,i)));
			i++;
			n/=db;
		}
		return sum;
	}
}
