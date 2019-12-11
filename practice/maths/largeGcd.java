import java.io.*;
import java.math.BigInteger;
public class largeGcd{
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger a=new BigInteger(br.readLine());
		BigInteger b=new BigInteger(br.readLine());
		BigInteger hcd=a.gcd(b);
		System.out.println(hcd);
	}
}
