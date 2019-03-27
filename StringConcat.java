import java.util.Scanner;
class StringConcat{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s1=cin.nextLine();
		String s2=cin.nextLine();
		s1=s1.trim();
		s2=s2.trim();
		String s3=s1.concat(s2);
		System.out.println(s3);
	}
}
