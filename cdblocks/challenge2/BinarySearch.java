import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=cin.nextInt();
		}
		int m=cin.nextInt();
		System.out.println(binarySearch(array,m));
	}
	public static int binarySearch(int[] arr,int m){
		int left=0,right=arr.length-1,mid;
		while(left<right){
			mid=(left+right)/2;
			if(arr[mid]==m){
				return mid;
			}
			else if(arr[mid]>m){
				right=mid-1;
			}else{
				left=mid+1;
			}
		}
		return -1;
	}
}
