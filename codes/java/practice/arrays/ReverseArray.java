/*
 * @author Saurav Jaiswal
 * @about Reverse Array
 * */
import java.util.*;
public class ReverseArray{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			list.add(val);
		}
		Reverse get=new Reverse();
		get.reverse(list);
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			int i=(Integer)itr.next();
			System.out.print(i+" ");
		}
		System.out.println("\nSearch: ");
		int key=cin.nextInt();

		if(Collections.binarySearch(list,key)>=0){
			System.out.println("Found");
		}
	}
}
class Reverse{
	private int low,high;
	public void reverse(ArrayList<Integer> list){
		low=0;
                high=list.size()-1;
                while(low<high){
                        Collections.swap(list,low,high);
                        low++;
                        high--;
                
		}
	}
}

