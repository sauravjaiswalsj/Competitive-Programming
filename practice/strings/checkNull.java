import java.util.Scanner;
public class checkNull{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s=cin.nextLine();
		String g=new String("hello");
		if(s.equals(g)){
			System.out.println("true");
		}
		else{
			System.out.println("false");
		}
	}
}
