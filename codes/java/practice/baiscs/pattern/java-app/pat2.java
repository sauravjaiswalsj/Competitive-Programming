import java.util.Scanner;
public class pat2{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int num=1;
		int row=1;
		while(row<=n){
			int c=1;
			while(c<=n){
				System.out.print(num);
				c++;
			}
			System.out.println("");
			num++;
			row++;
		}
	}
}

