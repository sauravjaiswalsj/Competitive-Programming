import java.util.*;
public class SimpleInput {
    public static void main(String args[]) {
        Scanner cin=new Scanner(System.in);
    /*int c;
    while((c=cin.nextInt())>=0){
        System.out.println(c);
    }*/
	int c,sum=0;
       do{
           c=cin.nextInt();
           sum=sum+c;
           System.out.println(c);
        }while(sum>=0);
    }
}
