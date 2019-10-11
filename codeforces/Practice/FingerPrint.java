import java.util.*;
import java.lang.*;
public class FingerPrint{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int n=cin.nextInt();
		int m=cin.nextInt();
		int[] arr=new int[n];
		int[] k=new int[m];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		for(int i=0;i<m;i++){
			k[i]=cin.nextInt();
		}
		for(int i=0;i<m;i++){
			int result=binarySearch(arr,0,n-1,k[i]);
			System.out.printf("%d ",result);
		}
	}
	public static int binarySearch(int arr[],int l, int u, int k){
                int mid;
                while(l<=u){
                        mid=(l+u)/2;
                        if(arr[mid]==k){
                                return mid;
                        }
                        else if(arr[mid]>k){
                                return binarySearch(arr,l,mid-1,k);
                        }
                        else{
                                return binarySearch(arr,mid+1,u,k);
                        }
                }
		return -1;
        }

}
