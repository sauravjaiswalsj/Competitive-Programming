import java.util.Scanner;
public class PascalTriangle{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nst=1;
		int nsp=n-1;
		while(row<=n){
			//work
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			// nums;
			int cst=1;
			int sum=1;
			while(cst<=nst){
				int c=1;
				System.out.print(sum+" ");
				sum=sum*(row-cst)/cst;
				cst++;
			}
			System.out.println("");
			nsp--;
			nst++;
			row++;
		}
	}
}

				
