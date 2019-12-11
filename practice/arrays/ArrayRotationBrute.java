import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;
Import java.util.ArrayList;
public class ArrayRotationBrute{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			list.add(val);
		}
		int d=cin.nextInt();
		rotate(list,0,d-1);
		rotate(list,d,n-1);
		rotate(list,0,n-1);
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			int i=(Integer)itr.next();
			System.out.print(i+" ");
		}
	}
	public static void rotate(ArrayList<Integer> list,int low,int high){
		//System.out.println(low+" "+high);
		while(low<high){
			Collections.swap(list,low,high);
			low++;
			high--;
		}
	}
}	
