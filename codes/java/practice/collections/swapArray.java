import java.util.*;
public class  swapArray{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			list.add(val);
		}
		int temp;
		for(int i=0;i<n-2;i++){
			temp=list.get(i);
			list.set(i,list.get(i+2));
			list.set(i+2,temp);
			//list.get(i)=list.get.get(i+2);
			//list.get(i+2)=temp;
		}
		for(int i:list){
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println(list);
	}
}
