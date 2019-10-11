import java.util.Scanner;
import java.math.BigInteger;
class SmallFact{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			int n=cin.nextInt();
			System.out.println(fact(n));
			t--;
		}
	}
	public static BigInteger fact(int n){
		BigInteger bf=BigInteger.ONE;
		while(n!=1){
			bf=bf.multiply(BigInteger.valueOf(n));
			n--;
		}return bf;
	}
}
