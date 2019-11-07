import java.lang.*;
import java.io.*;
public class trimJava{
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str;
		do{
			str=br.readLine();
			str.trim();
			System.out.println(str);
		}while(!str.equals("exit"));
	}
}
