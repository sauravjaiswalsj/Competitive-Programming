import java.util.Scanner;
public class pattern4{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nsp=n-1;
		int nst=1;
		int row=1;
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
				System.out.print("*");
				cst++;
			}
			System.out.println("");
			//prep
			nsp=nsp-1;;
			nst=nst+1;
			row=row+1;
		}
	}
}

