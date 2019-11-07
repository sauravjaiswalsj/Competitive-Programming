import java.util.Scanner;
public class secondLargest{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextInt();
		}
		Solver get=new Solver();
		int m=get.secondLargest(arr);
		System.out.println(m);
		//System.out.println(new Solver().secondLargest(arr));
	}
}
class Solver{
	public int secondLargest(int[] arr){
		int largest=arr[0];
		int secLargest=arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>=largest){
				secLargest=largest;
				largest=arr[i];
			}
			System.out.println(largest+" "+secLargest);
		}
		return secLargest;
	}
}
