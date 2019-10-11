import java.util.*;
public class Manmohan2{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		System.out.println("1");
		int row=2;
		int nst=2;
		int val=1;
		while(row<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print(val);
				cst++;
			}
			int zero=1;
			while(zero<nst){
				System.out.print("0");
				zero++;
			}
			cst=1;
			while(cst<=nst){
				System.out.print(val);
				cst++;
			}
			//prep
			System.out.println("");
			row++;
			nst++;
			if(row<=2){
				val=1;
			}else{
				val++;
			}
		}
	}
}
