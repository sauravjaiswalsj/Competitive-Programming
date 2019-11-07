import java.util.Scanner;
public class pat12{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=n){
			//work
			//spaces;
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			//stars
			int cst=1;
			while(cst<=nst){
				System.out.print(cst);
				cst++;
			}
			//prep
			System.out.println("");
			nsp--;
			nst+=2;
			row++;
		}
	}
}

