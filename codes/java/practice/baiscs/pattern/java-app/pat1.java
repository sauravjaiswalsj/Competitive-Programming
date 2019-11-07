import java.util.*;
public class pat1{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nst=5;
		int row=1;
		while(row<=n){
			int cst=1;
			while(cst<=nst){
				System.out.print("*");
				cst++;
			}
			System.out.println("");
			row++;
		}
	}
}
