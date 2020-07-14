// Fibnocci Secquence
import java.util.Scanner;

class BrickWallPatterns{
	public static void main(String[] args){
		Scanner cin =new Scanner(System.in);
		int n;
		while((n=cin.nextInt())!=0){
			System.out.println(getWallLength(n));
		}
	}
	private static long getWallLength(int n){
		if(n==1) return 1;
		if(n==2) return 2;
		long a=1;
		long b=2;
		long sum=0;
		for(int i=3;i<=n;i++){
			sum=a+b;
			a=b;
			b=sum;
		}
		return sum;
	}
}
