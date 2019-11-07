import java.util.Scanner;
public class pat15{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nr=2*n-1;
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=nr){
			//work
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			// star
			int cst=1;
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			//prep
			System.out.println("");
			if(row<=nr/2){
				nst++;
				nsp--;
			}
			else{
				nst--;
				nsp++;
			}
			row++;
		}
	}
}
