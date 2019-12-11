import java.io.*;
public class Main{
	public static void main(String[] args)throws IOException{
		final BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		for(int test=Integer.parseInt(br.readLine());test>0;test--){
			System.out.println(getShortString(br.readLine()));
		}
	}
	private static String getShortString(String s){
		if(s.length()<=10){
			return s;
		}
		int len=s.length()-2;
		String t=s.charAt(0)+String.valueOf(len)+s.charAt(s.length()-1);
		return t;
	}
}
