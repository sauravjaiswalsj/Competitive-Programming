import java.io.*;;
import java.math.BigInteger;
public class big1{
	public static void main(String[] args)throws IOException{
		/*print();
		mul();
		add();*/
		//modInverse();
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println(factorial(Integer.parseInt(br.readLine())));	
	}
	public static void print(){
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger("12342");
		BigInteger c = BigInteger.valueOf(12349209L);
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
	public static void mul(){
		BigInteger a = new BigInteger("123");
		BigInteger b = BigInteger.valueOf(13342L);
		System.out.println(a.multiply(b));
	}
	public static void add(){
		BigInteger a = BigInteger.ONE;
		BigInteger b = new BigInteger("12343");
		BigInteger c = BigInteger.valueOf(12343224L);
		BigInteger result = a.multiply(c).add(a).divide(c).add(new BigInteger("133"));
		System.out.println(result);
	}
	public static void mod(){
		BigInteger a=BigInteger.TEN;
		BigInteger b=new BigInteger("12432");
		BigInteger result=b.mod(a);
		System.out.println(result);
	}
	public static void modInverse(){
		BigInteger a=new BigInteger("123342");
		BigInteger b=BigInteger.TEN;
	//	System.out.println(a.modInverse("k"));
	}
	private static BigInteger factorial(int n){
		BigInteger result=BigInteger.ONE;
		for(int i=2;i<=n;i++){
			result=result.multiply(BigInteger.valueOf(i));
		}
		return result;
	}
}


