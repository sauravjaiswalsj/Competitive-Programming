import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collection;
public class DuplicateElements{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			list.add(val);
			//arr[i]=cin.nextInt();
		}
		
		int flag=0;
		for(int i=0;i<n;i++){
			for(int j=i+1;j<n;j++){
				if(list.get(i)==list.get(j)){
					flag++;
					list.remove(i);
					n--;
				}
			}
		}
		if(flag>0){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		for(Integer i: list){
			System.out.println(i);
		}
	}
}
