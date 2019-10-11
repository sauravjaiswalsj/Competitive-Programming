import java.util.*;
public class permut{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s=cin.next();
		if((s.equals("abc"))||(s.equals("acb"))||(s.equals("bac"))||(s.equals("cab"))||(s.equals("bca"))||(s.equals("cba"))){
				System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
