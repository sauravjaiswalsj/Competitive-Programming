import java.util.*;
public class MinimumRotated{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=cin.nextInt();
		}
		System.out.println(MinimumRotation(array));
	}
	public static int MinimumRotation(int[] array){
		int left=0,right=array.length-1;
		if(array[left]<array[right]) return array[left];
		if(array.length==1) return array[left];
		while(left<right){
			// Find the inflectionPoint
			int midPoint=(left+right)/2;
			//check if midpoint is not the inflectionPoint
			if(array[midPoint]>array[midPoint+1] && midPoint<array.length) return array[midPoint+1];
			if(array[midPoint]<array[midPoint-1] && midPoint>0) return array[midPoint];
			if(array[midPoint]>array[left]){
				left=midPoint+1;
			}else{
				right=midPoint-1;
			}
		}
		return -1;
	}
}
