import java.util.*;
import java.math.*;
public class Problem7{
	public static final Scanner cin=new Scanner(System.in);
	public static void scientificNotation(long fact, int count){
		int n=fact;
		int c=0;
		if(count>4){
			while(n!=0){
				r=n%10;
				n/=10;
				c++;
			}
			if(r!=0){
				System.out.println(fact+r);
			}

		}
	}
	public static void main(String[] args){
			long fact=cin.nextLong();
			int count=0;
                        int num=fact;
                while(num != 0)
                        {
                            num /= 10;
                            count++;
                         }
                if(count<5){
                        System.out.println(fact);
                }

			scientificNotation(fact, count);
	}
}
