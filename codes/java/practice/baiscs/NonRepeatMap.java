import java.util.*;
public class NonRepeatMap{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
		String name=cin.nextLine();
		int i=0;
		while(i<name.length()){
			if(map.containsKey(name.charAt(i))==false){
				map.put(name.charAt(i),1);
			}
			else{
				int old=map.get(name.charAt(i));
				int newD=old+1;
				map.put(name.charAt(i),newD);
			}
			i++;
		}
		Set<Map.Entry<Character,Integer>> hmap=map.entrySet();
		for(Map.Entry<Character,Integer> data:hmap){
			if(data.getValue()==1){
				System.out.println(data.getKey());
				break;
			}
		}
	}
}

