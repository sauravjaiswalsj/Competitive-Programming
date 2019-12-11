//Asked by Amazon
import java.util.*;
import java.io.*;
public class CountCharacters{
	public static void main(String[] args)throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t=Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++){
			countCharacters(br.readLine());
		}
	}
	private static void countCharacters(String s){
		int lc=0,uc=0,nc=0,sc=0;
		for(int i=0;i<s.length();i++){
			if(Character.isLowerCase(s.charAt(i))){
				lc++;
			}
			else if(Character.isUpperCase(s.charAt(i))){
				++uc;
			}
			else if(Character.isDigit(s.charAt(i))){
				++nc;
			}else{
				++sc;
			}
		}
		System.out.println(uc+"\n"+lc+"\n"+nc+"\n"+sc);
	}
}
