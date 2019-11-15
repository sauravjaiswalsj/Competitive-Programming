/*
 * Basic Trick:
 * nsp= 2*nrow-1
 * nst=n-nsp 
 */

import java.util.Scanner;
public class HollowDiamond{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nrow=1;
		int nsp=2*nrow-1;
		int nst=n-nsp;
		while(nrow<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print("*\t");
				cst++;
			}
			int csp=1;
			while(csp<=nsp){
				System.out.print("\t");
				csp++;
			}
			System.out.println();
			if(nrow<n/2){
				nsp=2*nrow-1;
				nst=n-nsp;
			}else{
				//nst=2*nrow-k;
				//nsp=n-nsp;
			}
			nrow++;
			
		}
	}
}
