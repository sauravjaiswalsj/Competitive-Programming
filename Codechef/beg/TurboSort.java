import java.util.*;

class TurboSort{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		int[] arr=new int[t];
		for(int i=0;i<t;i++){
			arr[i]=cin.nextInt();
		}
			Arrays.sort(arr);
			for(int i=0;i<t;i++){
			System.out.println(arr[i]);
		}
	}
}
