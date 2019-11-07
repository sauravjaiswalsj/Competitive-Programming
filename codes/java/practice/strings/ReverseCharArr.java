import java.lang.*;
import java.util.*;
public class ReverseCharArr{
    public static void main(String[] args){
        Scanner cin=new Scanner(System.in);
        char[] s=new char[10];
        for(int i=0;i<s.length;i++){
            s[i]=cin.next().charAt(0);
        }
        System.out.println(rev(s));
    }
    public static String rev(char[] s){
        String st=new String(s);
        StringBuffer b= new StringBuffer(st);
        String t=b.reverse().toString();
        return t;
    }
}
