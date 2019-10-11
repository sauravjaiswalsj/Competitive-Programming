import java.util.*;
public class ReverseNum{
    public static void main(String[] args){ 
Scanner cin = new Scanner(System.in);
int n=cin.nextInt();
System.out.println(reverse(n));
}
public static int reverse(int n){
        int sum=0;
	if(n<10){
	return n;
	} 
 	while(n!=0){
		int rem=n%10;
		sum=(sum*10)+rem;
		n/=10;
	}
	return sum;
    }
}
 

