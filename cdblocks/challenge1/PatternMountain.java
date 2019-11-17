//nsp=2*n-3
import java.util.Scanner;
public class PatternMountain{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nrow=1;
		int nst=1;
		int nsp=2*n-3;
		int val=1;
		while(nrow<=n){
			//work
			val=1;	
			int cst=1;
			while(cst<=nst){
				System.out.print(val+"\t");
				if(cst!=nst){
					val++;
				}
				++cst;
				
			}
			int csp=1;
			while(csp<=nsp){
				System.out.print("\t");
				++csp;
			}
			if(nrow==n){--val;}
			int csd=1;
			while(csd<=nst){
				System.out.print(val+"\t");
				++csd;
				val--;
			}
			//prep
			System.out.println();
			++nrow;
			nsp-=2;
			++nst;
		}
	}
}
