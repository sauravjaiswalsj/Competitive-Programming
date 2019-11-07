import java.util.*;
public class treeMap{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		TreeMap<Integer,String> map=new TreeMap<>();
		for(int i=0;i<n;i++){
			int val=cin.nextInt();
			cin.nextLine();
			String name=cin.nextLine();
			map.put(val,name);
		}
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+" : "+m.getValue());
		}
	}
}	
