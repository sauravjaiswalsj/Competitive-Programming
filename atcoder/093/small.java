import java.util.*;
public class small{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int a,b;
		a=cin.nextInt();
		b=cin.nextInt();
		int k=cin.nextInt();
		int n=k;
		int c=b;
		System.out.println(a);
		for(int i=a;i<=min(b,a+k−1);i++){ 
			System.out.printf(”%d/n”,+i);
		}
		for(int i=max(b−k+1,a+k);i<=b;i++){
			System.out.printf(”%d/n”,+i);
		}
		System.out.println(b);
	}
}
