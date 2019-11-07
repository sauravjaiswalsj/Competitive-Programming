import java.util.Scanner;
public class pattern7{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int row=1;
		int nr=cin.nextInt();
		int nst=nr/2;
		int nsp=1;
		while(row<=nr){
			int cst=1;
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			int csp=1;
			while(csp<=nsp){
				System.out.print(" ");
				csp++;
			}
			int csd=1;
			while(csd<=nst){
				System.out.print("*");
				csd++;
			}
			//prep
			System.out.println("");
			if(row<=nr/2){
				nst--;
				nsp+=2;
			}
			else{
				nst++;
				nsp-=2;
			}
			row++;
		}
	}
}
