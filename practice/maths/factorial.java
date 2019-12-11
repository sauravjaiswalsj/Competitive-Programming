import java.io.*;
import java.math.BigInteger;
public class factorial{
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		for(int i=0;i<test;i++){
			System.out.println(factorial(Integer.parseInt(br.readLine())));
		}
	}
	public static BigInteger factorial(int n){
		BigInteger fact=BigInteger.ONE;
		for(int i=2;i<=n;i++){
			fact=fact.multiply(BigInteger.valueOf(i));
		}
		return fact;
	}
}
