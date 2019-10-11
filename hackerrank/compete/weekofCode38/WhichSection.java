import java.util.*;
import java.lang.*;
public class WhichSection{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int t=cin.nextInt();
		while(t!=0){
			countSection();
			t--;
		}
	}
	public static void countSection(){
		final int n=cin.nextInt();
		final int k=cin.nextInt();
		final int m=cin.nextInt();
		int[] arr=new int[m];
		for(int i=0;i<arr.length;i++){
			arr[i]=cin.nextInt();
		}
		//finding section
		//11,35,455,461,470
		int[] sum=new int[m];
		int add=0;
		for(int i=0;i<arr.length;i++){
			sum[i]=arr[i]+add;
			add=sum[i];

		}
		for(int i=0;i<sum.length;i++){
			if((k>sum[i])&&(k<sum[i+1])){
				System.out.println(i+2);
			}
		}
	}
}

			
