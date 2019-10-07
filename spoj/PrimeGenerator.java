import java.util.*;
class PrimeGenerator{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		while(test!=0){
			long a=cin.nextLong();
			long b=cin.nextLong();
			for(long i=a;i<=b;i++){
				if(Prime(i)){
					System.out.println(i);
				}
			}
			test--;
		}
	}
	public static boolean Prime(long n){
		if(n<=1)return false;
		if(n==2 || n==3) return true;
		if(n%2==0 || n%3==0) return false;
		for(long i=3;i<Math.sqrt(n);i++){
			if(n%i==0){
				return false;
			}
		}
		return true;
	}
}
