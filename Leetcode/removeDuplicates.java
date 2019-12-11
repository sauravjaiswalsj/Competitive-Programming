import java.util.*;
public class removeDuplicates{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] ar=new int[n];
		for(int i=0;i<n;i++){
			ar[i]=cin.nextInt();
		}
		int index=removeTwice(ar);
		for(int i=0;i<index;i++){
			System.out.print(ar[i]+" ");
		}
	}
	private static int remove(int[] ar){
		int left=1;
		for(int right=0;right<ar.length-1;right++){
		//	System.out.println(ar[i]+" "+ar[i+1]);
			if(ar[right]!=ar[right+1]){
		//		System.out.println("c"+ar[i]+" "+ar[i+1]);
				ar[left++]=ar[right+1];
			
			}
		}
		return left;
	}
	public static int removeTwice(int[] ar){
		int left= 2;
		for(int right=2;right<ar.length;right++){
			if((ar[left-2]!=ar[right])){
				ar[left++]=ar[right];
			//	lc=1;
			}
		}
		//System.out.println();
		return left;
	}

}
