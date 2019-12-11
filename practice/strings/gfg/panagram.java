import java.util.*;
import java.util.Collections;
public class panagram{
	public static void main(String[] args){
		final Scanner cin=new Scanner(System.in);
		//final StringBuilder sb=new StringBuilder(cin.nextLine());
		final String sb=cin.nextLine();
		sb.trim();
		Set<Character> set=new TreeSet<>();
		for(int i=0;i<sb.length();i++){
			if(Character.isWhitespace(sb.charAt(i))){continue;}
			set.add(sb.charAt(i));
		}
		if(set.size()==26){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
		System.out.println(set.size());
		for(Character c:set){
			System.out.print(c+" ");
		}
	}
}
