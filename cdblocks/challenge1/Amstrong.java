import java.util.*;
public class Amstrong {
    public static void main(String args[]) {
        Scanner cin=new Scanner(System.in);
        int n=cin.nextInt();
        System.out.println(AmstrongChecker(n));
    }
    public static boolean AmstrongChecker(int n){
        int sum=0,temp=n;;
        while(n!=0){
            int rem=n%10;
            sum=sum+(rem*rem*rem);
            n/=10;
        }
        if(sum==temp){
            return true;
        }else
        return false;
    }
}
