import java.io.*;
public class Multiplication{
	public static void main(String[] args)throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a=Integer.parseInt(br.readLine());
		int b=Integer.parseInt(br.readLine());
		System.out.println(a*b);
	}
}
