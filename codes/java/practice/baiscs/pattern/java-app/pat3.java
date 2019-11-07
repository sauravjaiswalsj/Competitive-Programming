import java.util.Scanner;
public class pat3{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		while(row<=n){
			int cs=1;
			while(cs<=n){
				System.out.print(cs);
				cs++;
			}
			System.out.println("");
			row++;
		}
	}
}
