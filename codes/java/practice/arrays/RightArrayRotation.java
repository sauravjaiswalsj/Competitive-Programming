import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class RightArrayRotation{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			list.add(cin.nextInt());
		}
		int d=cin.nextInt();
		RightRotation(list,0,list.size()-1);
		RightRotation(list,0,d-1);
		RightRotation(list,d,list.size()-1);
		for(int i:list){
			System.out.print(i);
		}
	}
	public static void RightRotation(ArrayList<Integer> list, int low,int high){
		while(low<high){
			Collections.swap(list,low,high);
			low++;
			high--;
		}
	}
}
