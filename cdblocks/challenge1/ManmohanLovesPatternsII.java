import java.util.Scanner;
public class ManmohanLovesPatternsII{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=1;
		int nrow=1;
		int pr=1;
		while(nrow<=n){
			//work
			int cst=1;
			while(cst<=nst){
				if(nst>2 && (cst>1 && cst<nst)){
					System.out.print("0");
				}
				else{
					System.out.print(pr);
				}
				cst++;
			}
			//prep
			System.out.println();
			nst++;
			nrow++;
			if(nrow>2)
				pr++;
		}
	}
}
			

