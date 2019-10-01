import java.util.*;
import java.lang.*;
class binarySearch{
	public int binarySearch(int arr[], int l, int u, int x){
		while(l<=u){
			int mid=(l+u)/2;
			if(arr[mid]==x){
				return mid;
			}
			else if(arr[mid]>x){
				return binarySearch(arr,l,mid-1,x);
			}
			else{
				return binarySearch(arr,mid+1,u,x);
			}
		}
		return -1;
	}
	
	public void sort(int arr[]){
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
public class absent{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		binarySearch b=new binarySearch();
		int n=cin.nextInt();
		int[] arr=new int[n];
                for(int i=0;i<n;i++){
                        arr[i]=cin.nextInt();
              	}
		b.sort(arr);
		for(int i=1;i<=n;i++){
	      		int result=b.binarySearch(arr,0,n-1,i);
			if(result==-1){
				System.out.printf("%d",i);
				System.out.printf(" ");
			}
		}
	}
}
