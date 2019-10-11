import java.util.Scanner;
public class Rhombus{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int nr=cin.nextInt();
		int row=1;
		int nst=nr;
		int nsp=nr-1;
		while(row<=nr){
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			int cst=1;
			while(cst<=nst){
				if(row==1 || cst ==1 || row ==nr || cst == nr){
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				cst++;
			}
			//prep
			System.out.println("");
			nsp--;
			row++;
		}
	}
}
