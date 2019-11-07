import java.util.Scanner;
public class pattern5{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nst=n;
		int nsp=0;
		while(row<=n){
			//work
			//space 
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			//stars
			int cst=1;
			while(cst<=nst){
				System.out.print("* ");
				cst++;
			}
			//prep
			System.out.println("");
			nsp++;
			nst--;
			row++;
		}
	}
}

