import java.util.Scanner;
public class SwapArrayRandom{
	public static void main(String[] args){
		final Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		Solution solver=new Solution();
		solver.swapArray(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
}
class Solution{
	public void swapArray(int[] array){
		int small=array[0];
		int large=array[0];
		int i=0,l=0,s=0;
		while(i<array.length){
			if(array[i]>large){
				large=array[i];
				l=i;
			}
			if(small>array[i]){
				small=array[i];
				s=i;
			}
			//System.out.print("l: "+large+"s: "+small);
			i++;
		}
		//System.out.println(array[l]+""+array[s]+""+large+""+small);
		int temp=array[l];
		array[l]=array[s];
		array[s]=temp;
	}
}
