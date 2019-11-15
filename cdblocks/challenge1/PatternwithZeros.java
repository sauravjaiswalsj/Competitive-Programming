import java.util.Scanner;
public class PatternwithZeros{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=1;
		int nrow=1;
		while(nrow<=n){
			int cst=1;
			while(cst<=nst){
				if(nst>2 && (cst>=2 && cst<nst)){
					System.out.print("0\t");
				}
				else{
					System.out.print(nrow+"\t");
				}
				cst++;
			}
			System.out.println();
			nst++;
			nrow++;
		}
	}
}

