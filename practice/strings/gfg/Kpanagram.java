//Zoho, Snapdeal
import java.io.*;
import java.util.*;
public class Kpanagram{
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int i=Integer.parseInt(br.readLine());i>0;i--){
			System.out.println(kPanagram(br.readLine(),Integer.parseInt(br.readLine())));
		}
	}
	private static int kPanagram(String string, int k){
		if(string.length()<26){return 0;}
		Set<Character> set=new HashSet<>();
		for(int i=0;i<string.length();i++){
			if(Character.isWhitespace(string.charAt(i))){continue;}
			set.add(string.charAt(i));
		}
		int size=26-set.size();
		if(size<=k){
			return 1;
		}
		return 0;
	}
}
