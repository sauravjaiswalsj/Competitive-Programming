import java.util.Scanner;
public class pattern6{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nr=2*n-1;
		int nst=1;
		int row=1;
		while(row<=nr){
			int cst=1;
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			//prep
			System.out.println("");
			if(row<=nr/2){
				nst++;
			}else{
				nst--;
			}
			row++;
		}
	}
}
