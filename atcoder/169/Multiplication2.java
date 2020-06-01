import java.util.Scanner;
import java.util.Arrays;
public class Multiplication2{
	public static void main(String[] args){
		final Scanner cin = new Scanner(System.in);
		int n = cin.nextInt();
		long[] arr=new long[n];
		for(int i=0;i<n;i++){
			arr[i]=cin.nextLong();
		}
		Arrays.parallelSort(arr);
		if(arr[0]==0){
			System.out.print(0);
			return;
		}
		long mul=1;
		for(long a:arr){
			if(mul*1.0*a >(long)1e18 || mul<=0){
				System.out.print(-1);
				System.exit(0);
			}
			mul=mul*a;
			//System.out.print(mul+" ");
		}
		//System.out.println();
		System.out.print(mul>(long)1e18?-1:mul);
	}
}

