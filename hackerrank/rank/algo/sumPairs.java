import java.util.*;
import java.lang.*;
class Solution{
	 static void Solution(int[] a,int n, int k){
		int sum,count=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				sum=a[i]+a[j];
				if(sum%k==0){
					count++;
				}
				else{
					sum=0;
				}
			}
		}
		System.out.println(count);
   	 }
}
public class sumPairs{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int n=cin.nextInt();
		int k=cin.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
			a[i]=cin.nextInt();
		}
		Solution b=new Solution();
		b.Solution(a,n,k);
	}
}
		
