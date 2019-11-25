import java.io.*;
import java.math.*;
public class factorialTrailingZero{
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			System.out.println(trailingZeroes(Integer.parseInt(br.readLine())));
		}
	}
	private static int factorial(int n){
		BigInteger fact=BigInteger.ONE;
		for(int i=2;i<=n;i++){
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		int count=0;
		while(fact.mod(BigInteger.TEN)==BigInteger.ZERO){
			++count;
			fact=fact.divide(BigInteger.TEN);
		}
		return count;
	}
	public static int trailingZeroes(int A) {
        int count=0;
        for(int i=5;(A/i)>0;i=i*5){
            count+=A/i;
        }
        return count;
    }
}
