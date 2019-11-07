import java.util.Scanner;
public class pattern3{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		// row
		int row=1;
		int nst =n;
		while(row<=n){
			// work
			int cst=1;
			while(cst<=nst){
				System.out.print("* ");
				cst++;
			}
			//prep
			System.out.println("");
			nst--;
			row++;
		}
	}
}
