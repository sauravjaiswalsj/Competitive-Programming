import java.util.Scanner;
public class patternMountain{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nrow=1;
		int nst=1;
		int nsp=n-1;
		int val=1;
		while(nrow<=n){
			//work
			int csp=1;
			while(csp<=nsp){
				System.out.print("\t");
				csp++;
			}
			int cst=1;
			while(cst<=nst){
				System.out.print(val+"\t");
				if(cst<=nst/2)
					++val;
				else
					--val;
				++cst;
			}
			//prep
			System.out.println();
			nsp--;
			nst+=2;
			nrow++;
			val=nrow;
		}
	}
}
