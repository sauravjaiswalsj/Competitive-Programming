import java.util.Scanner;
public class PatternStar{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=1;
		int nsp=n-1;
		int nrow=1;
		while(nrow<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print(cst);
				++cst;
			}
			int csp=1;
			while(csp<=nsp){
				System.out.print("*");
				++csp;
			}
			System.out.println();
			++nst;
			--nsp;
			++nrow;
		}
	}
}
