import java.util.Scanner;
public class pat11{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1; // this is the start of the row
		int nsp=n-1; // this is the spaces we need for each row
		int nst=1; // this is count of stars we need to print in each row
		while(row<=n){
			//work
			int csp=1;// for each row
			while(csp<=nsp){ // print the n spaces
				System.out.print(" ");
				csp++;
			}
			int cst=1;// for each stars print the stars
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			//prep
			System.out.println("");
			nst+=2;
			nsp--;
			row++;
		}
	}
}
