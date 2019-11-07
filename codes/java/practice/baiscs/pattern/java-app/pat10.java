import java.util.Scanner;
public class pat10{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nsp=0;
		int nst=n;
		while(row<=n){
			//work
			//space
			//space strats
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			//nums
			int cst=1;
			int num=1;
			while(cst<=nst){
				System.out.print(num);
				num++;
				cst++;
			}
			//prep
			System.out.println("");
			nst--;
			nsp++;
			row++;
		}
	}
}
