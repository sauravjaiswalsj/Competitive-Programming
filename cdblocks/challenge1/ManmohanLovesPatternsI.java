import java.util.*;
public class ManmohanLovesPatternsI{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=1;
		int nrow=1;
		while(nrow<=n){
			//work
			int cst=1;
			while(cst<=nst){
				if((nst%2==0 && nst!=2) &&(cst > 1 && cst<nst)){
					System.out.print("0");
				}else{
					System.out.print("1");
				}
				cst++;
			}
			//prep
			System.out.println();
			nrow++;
			nst++;
		}
	}
}
