import java.util.Scanner;
public class PatternStar2{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=n;
		int nsp=n-nst;
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
			--nst;
			++nrow;
			nsp+=2;
		}
	}
}
