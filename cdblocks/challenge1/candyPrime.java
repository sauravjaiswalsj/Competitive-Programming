import java.util.*;
public class candyPrime {
    public static void main(String args[]) {
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		while(test!=0){
			int n=cin.nextInt();
			System.out.println(GeneratePrime(n));
			test--;
		}
    }
	public static int GeneratePrime(int n){
		int count=0,prime=2,last=0;
		if(n==1)return 2;
		while(count<=n){
			for(int i=2;i<=n;i++){
				if(prime/i==0){
					last=prime;
				}
				prime++;
				count++;
			}
		}
		return last;
	}
}
