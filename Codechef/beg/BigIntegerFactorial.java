import java.math.BigInteger;
import java.io.*;
public class BigIntegerFactorial{
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			System.out.println(factorial(Integer.parseInt(br.readLine())));
		}
	}
	private static BigInteger factorial(int n){
		BigInteger result = BigInteger.ONE;
		for(int i=2;i<=n;i++){
			result=result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}
