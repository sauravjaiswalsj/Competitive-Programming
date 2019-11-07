import java.util.*;
public class arrayList{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>();
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			list.add(val);
		}
		Collections.sort(list);
		for(int i:list){
			System.out.print(i+" ");
		}
	}
}
