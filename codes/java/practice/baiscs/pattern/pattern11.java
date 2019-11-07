import java.util.Scanner;
public class pattern11{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=1;
		int row=1;
		while(row<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print(row);
				cst++;
			}
			//prep
			System.out.println("");
			nst++;
			row++;
		}
	}
}
