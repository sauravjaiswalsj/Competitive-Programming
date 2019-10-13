import java.util.*;
public class StringSort {
    public static void main(String args[]) {
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<String> list=new ArrayList<>();
		for(int i=0;i<=n;i++){
			String s=cin.nextLine();
			list.add(s);	
		}
		Collections.sort(list);
		for(String s:list){
			System.out.println(s);
		}
	}
}
