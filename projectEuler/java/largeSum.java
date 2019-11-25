import java.io.*;
import java.math.*;
public class largeSum{	
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new FileReader("13.txt"));
		String line;
		BigInteger sum=BigInteger.ZERO;
		while((line=br.readLine())!=null){
			sum=sum.add(new BigInteger(line));

		}
		/*System.out.println(sum);*/
		String str=sum.toString();
		System.out.println(str.substring(0,10));
	}
}
