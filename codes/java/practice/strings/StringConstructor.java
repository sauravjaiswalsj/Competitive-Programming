import java.lang.*;
public class StringConstructor {
    public static void main(String[] args){
        char[] chr={'a','b','c','a','t'};
        String s=new String(chr,2,3);
        System.out.println(s);
        System.out.println(s.getClass().getName());
    }
}