import java.util.Scanner;
public class pat18{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nsp=n-1;
		int nst=1;
		while(row<=n){
			//work
			//space;
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			//star
			int cst=1;
			int c=1;
			while(cst<=nst){
				System.out.print(c);
				if(cst<=(nst/2)){
					c++;
				}
				else{
					c--;
				}
				cst++;
			}
			//prep
			System.out.println("");
			nsp--;
			nst+=2;
			row++;
		}
	}
}
