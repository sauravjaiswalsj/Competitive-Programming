import java.util.Scanner;
public class BinarySearch{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int item=55;
		int[] arr={10,20,30,35,40,45,50,55,60,65,70};
		int bin=Search(arr,item);
		System.out.println(arr[bin]+" "+bin);
	}
	public static int Search(int[] arr,int item){
		int low=0,high=arr.length-1;
		int mid;
		while(low<=high){
			mid=(low+high)/2;
			if(arr[mid]==item){
				return mid;
			}else if(arr[mid]<item){
				low=mid+1;
			}
			else{
				high=mid-1;
			}
		}
		return -1;
	}
}
