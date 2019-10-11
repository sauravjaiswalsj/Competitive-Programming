import java.util.*;
class Sort{
	public void sorting(int[] arr){
		 int n = arr.length;
        int c=0;
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
			 if(arr[j] > arr[j+1]){
                   		 int temp = arr[j];
                    		 arr[j] = arr[j+1];
                   		 arr[j+1] = temp;
				 c++;
                		}
    			}
		}
		if(c>1){
			System.out.println(c);
		}
		else{
			System.out.println(c);
		}
	}
}
public class swap{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int n=cin.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		Sort ob=new Sort();
		ob.sorting(arr);
	}
}
