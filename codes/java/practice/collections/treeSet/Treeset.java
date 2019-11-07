import java.util.*;
public class Treeset{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		TreeSet<Integer> ts=new TreeSet<>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			ts.add(val);
		}
		Iterator itr=ts.iterator();
		while(itr.hasNext()){
			int i=(Integer)itr.next();
			System.out.print(i+" ");
			if(i%2==0){
				itr.remove();
			}
		}
		System.out.println();
		for(int i:ts){
			System.out.print(i+" ");
		}	
	}
}
