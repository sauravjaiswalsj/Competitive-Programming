import java.lang.*;
public class reverseString{
public static void main(String[] args){
	String s="hello";
	StringBuffer b=new StringBuffer(s);
	String t=b.reverse().toString();
	System.out.println(s);
	System.out.println(t);
	}
}
