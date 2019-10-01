import java.util.*;
import java.lang.Math;
public class ArrayQuery{
        public static final Scanner cin=new Scanner(System.in);
        public static void calculation(){
                int a,b,n;
                a=cin.nextInt();
                b=cin.nextInt();
                n=cin.nextInt();
                int sum=a,x;
                for(int i=0;i<n;i++){
                        x=(int) Math.pow(2,i);
                        sum=sum+x*b;
                        System.out.printf("%d ",sum);
                }
            System.out.println();
        }
        public static void main(String[] args){
                int t=cin.nextInt();
                while(t!=0){
                        calculation();
                        t--;
                }
        }
}
