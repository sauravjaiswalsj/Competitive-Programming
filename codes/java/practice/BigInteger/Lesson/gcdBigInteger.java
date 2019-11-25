import java.util.Scanner;
import java.math.BigInteger;
public class gcdBigInteger{
	public static void main(String[] args)/*throws IOException*/{
		/*final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BigInteger a=new BigInteger(br.readLine());
		BigInteger b=new BigInteger(br.readLine());
		*/
		final Scanner cin=new Scanner(System.in);
		BigInteger a=cin.nextBigInteger();
		BigInteger b=cin.nextBigInteger();
		System.out.println(a.gcd(b));
	}
}
