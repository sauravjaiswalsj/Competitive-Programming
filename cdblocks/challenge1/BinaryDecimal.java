import java.util.*;
public class BinaryDecimal{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			int n=cin.nextInt();
			System.out.println(ToConvert(n));
			t--;
		}
	}
	public static int ToConvert(int n){
		int i=0,sum=0;
		while(n!=0){
			int rem=n%10;
			sum=sum+(rem*(int)Math.pow(2,i));
			n/=10;
			i++;
		}
		return sum;
	}
}
