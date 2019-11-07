import java.util.Scanner;
public class pat16{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nr=2*n-1;
		int row=1;
		int nsp=n-1;
		int nst=1;
		int c=n-1;
		int k=2;
		while(row<=nr){
			//work
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			// star
			int i=c;
			int cst=1;
			while(cst<=nst){
				System.out.print(i);
				cst++;
				i++;
			}
			//prep
			System.out.println("");
			if(row<=nr/2){
				nst++;
				nsp--;
				c=n-k;
			}
			else{
				nst--;
				nsp++;
				c++;
			}
			row++;
			k++;
		}
	}
}
