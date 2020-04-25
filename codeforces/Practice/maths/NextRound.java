import java.util.*;
public class NextRound{
	public static void main(String[] args){
		final Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int k=cin.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		System.out.print(countWinner(n,k,arr));
	}
	//10 9 8 7 7 7 5 5
	public static int countWinner(int n,int k,int[] arr){
		int count=0,diffcount=0;
		for(int i=k;i<n;i++){
			if(arr[i]>k){
				count++;
			}
		}
		for(int i=0;i<k+1;i++){
			if(arr[i]>=k){
				diffcount++;
			}
		}
		return diffcount+count;
	}
}
