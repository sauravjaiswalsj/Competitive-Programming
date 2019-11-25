// sum=sum*(nrow-cst)/cst
import java.util.Scanner;
public class PascalTriangle{
        public static void main(String[] args){
                Scanner cin=new Scanner(System.in);
                int n=cin.nextInt();
                int nrow=1;
                int nst=1;
                int nsp=n-1;
		while(nrow<=n){
			int sum=1;
			int cst=1;
			while(cst<=nst){
				System.out.print(sum+"\t");
				sum=sum*(nrow-cst)/cst;
				cst++;
			}
			//prep
			System.out.println();
			nst++;
			++nrow;
		}
	}
}
