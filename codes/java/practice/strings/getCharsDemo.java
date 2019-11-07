import java.lang.*;
public class getCharsDemo{
	public static void main(String[] args){
		String s="This is a demo of the get Chars Method";
		int start=2, end=10;
		char[] buf=new char[end-start];
		s.getChars(start,end,buf,0);
		System.out.println(buf);
	}
}
