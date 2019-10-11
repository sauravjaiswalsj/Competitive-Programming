import java.util.Scanner;
public class MaxArray{
	public static void main(String[] args){
		int[] arr={10,20,30,-12,-1231,34};
		System.out.println(MaxValue(arr));
	}
	public static int MaxValue(int[] arr){
		int max=Integer.MIN_VALUE;
		for(int i:arr){
			if(i>max){
				max=i;
			}
		}
		return max;
	}
}
