import java.util.*;

class SmartPhone{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		long[] arr=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		Arrays.sort(arr);	
		long sum=arr[0]*n;
		long num=sum;
		for(int i=1;i<n;i++){
			sum=arr[i]*(long)(n-i);	
			if(sum>=num){
				num=sum;
			}
		}
		System.out.println(num);
	}
}
