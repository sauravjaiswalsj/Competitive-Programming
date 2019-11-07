import java.util.Scanner;
public class pat6{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int row=1;
		int nst=1;
		char a; 
		while(row<=n){
			int cst=1;
			a='A';
			while(cst<=nst){
				System.out.print((char)a);
				cst++;
				a++;
			}
			System.out.println("");
			nst++;
			row++;
			
		}
	}
}
