import java.io.*;
import java.util.*;
public class StringSlice {
    public static void main(String args[] ) throws Exception {
    Scanner cin=new Scanner(System.in);
    String s=cin.nextLine();
    //cin.next();
    int start=cin.nextInt();
    int end=cin.nextInt();
    for(int i=start;i<=end;i++){
	    System.out.println(s.charAt(i));
    }

    	//Write code here

   }
}

