import java.io.*;
import java.math.*;
public class FactorialDigitSum{
	public static void main(String[] args)throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println(factorialSum(Integer.parseInt(br.readLine())));
	}
	/*
	 * @param Takes the number whose factorial has to be constructed
	 * @return the sum of the factorial sum;
	 */
	private static int factorialSum(int n){
		//factorial
		//mod sum
		BigInteger fact=BigInteger.ONE;
		for(int i=2;i<=n;i++){
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		//modSum
		BigInteger ten=BigInteger.TEN;
		int sum=0;
		while(fact!=BigInteger.ZERO){
			BigInteger rem=fact.mod(ten);
			sum+=rem.intValue();
			fact=fact.divide(ten);
		}
		return sum;
	}
}
