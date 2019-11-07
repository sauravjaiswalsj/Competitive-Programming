import java.util.Scanner; 
public class pat13{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nst=n+2;
		int nsp=0;
		while(row<n){
			//spaces;
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
			nst-=2;
			nsp++;
			row++;
		}
	}
}

