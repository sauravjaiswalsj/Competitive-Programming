import java.util.*;
public class power{
public static int power(int n,int x){
	if(x==0) return 1;
	return n*power(n,x-1);
}
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		System.out.println(power(n,4));
	}
}
