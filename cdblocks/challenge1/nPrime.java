/* Explation
 * 1. I need to take the input till where I need to find the nth prime
 * 2. Use a counter variable say count from 1 to n
 * 3. Check for each prime number starting from 2 to <infinity>
 * 4. If it is prime then and only then increament the count
 * 5. At least create a boolean primeChecker function of Complexity ----> O(nlog(logn)) times
 * 6. Increment the Prime Number and Return the last Num
 * */
import java.util.Scanner;
public class nPrime{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		while(test!=0){
			int count=cin.nextInt();
			System.out.println(GeneratePrime(count));
			test--;
		}
	}
	public static int GeneratePrime(int n){
		if(n==1){return 2;}
		if(n==0){return 1;}
		int count=1,num=2,last=0;
		while(count<=n){
			if(checkPrime(num)){
				last=num;	
				count++;
			}
			num++;
		}
		return last;
	}
	public static boolean checkPrime(int n){
		if(n==2 || n==3){return true;}
		if((n%2==0 || n%3==0)&&(n!=2 ||n!=3)){return false;}
		for(int i=3;i<Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
		
}
