import java.util.Scanner;
public class reverse{
	public static void main(String[] args){
		final Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		StringBuilder sb=new StringBuilder(s);
		System.out.println(sb.reverse());
		sb.deleteCharAt(2);
		System.out.println(sb);
		sb.setCharAt(1,'d');
		System.out.println(sb);
		String x="123";
		x.replaceAll("1","0");
		System.out.println(x);
	}
}
