import java.util.*;
public class Problem3{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int n=cin.nextInt();
		int[] arr=new int[n*2];
		for(int i=0;i<arr.length;i++){
			arr[i]=cin.nextInt();
		}	
		System.out.println(sorting(arr));
	}
	public static int sorting(int[] arr){
		int key,c=0;
		for(int j=2;j<arr.length;j++){
			key=arr[j];
			int i=j-1;
			while((i>0)&&(arr[i]>key)){
				arr[i+1]=arr[i];
				i=i-1;
				arr[i+1]=key;
				c++;
			}
		}
		return c;
	}
}
