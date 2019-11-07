import java.util.Scanner;
public class pat9{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
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
			int Num=1;
			while(cst<=nst){
				System.out.print(Num);
				cst++;
				Num++;
			}
			//prep
			System.out.println("");
			nsp--;
			nst++;
			row++;
		}
	}
}
