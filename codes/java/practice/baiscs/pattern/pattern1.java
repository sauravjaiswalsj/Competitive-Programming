
import java.util.Scanner;
public class pattern1{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
}

