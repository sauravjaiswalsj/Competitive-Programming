import java.util.*;

class MaximumRemaining{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		Arrays.sort(arr);
		int j=arr[n-1];
		System.out.println(arr[n-2]%j);
	}
}
