import java.util.Scanner;
public class pat17{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nsp=n/2;
		int nst=1;
		while(row<=n){
			//work
			//spaces
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			//stars;
			int cst=1;
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			//perp
			System.out.println("");
			if(row<=n/2){
				nst+=2;
				nsp--;
			}
			else{
				nst-=2;
				nsp++;
			}
			row++;
		}
	}
}
