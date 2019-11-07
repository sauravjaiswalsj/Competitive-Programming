import java.util.Scanner;
public class pat7{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nst=n;
		int c;
		while(row<=n){
			int cst=1;
			c=1;
			while(cst<=nst){
				System.out.print(c);
				cst++;
				c++;
			}
			System.out.println("");
			nst--;
			row++;
		}
	}
}

	       		
