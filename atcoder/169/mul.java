import java.util.Scanner;
import java.math.BigInteger;

public class mul{
	public static void main(String[] args){
		final Scanner cin = new Scanner(System.in);
		BigInteger a=cin.nextBigInteger();
		BigInteger b=cin.nextBigInteger();
		BigInteger c=BigInteger.ONE;
		c=a.multiply(b);
		System.out.println(c);
	}
}

