import java.util.*;
public class LinkedCollection{
	public static void main(String[] args){
		LinkedList<Integer> list=new LinkedList<Integer>();
		for(int i=1;i<10;i++){
			list.add(i);
		}
		System.out.println(Collections.reverse(list));
	}
}
		
