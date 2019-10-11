import java.util.*;
import java.lang.*;
public class CPTTRN1{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args) throws java.lang.Exception{	
		int testCase=cin.nextInt();
		while(testCase!=0){
			PatternPrinting();
			testCase--;
		}
	}
	public static void PatternPrinting(){
		int n=cin.nextInt();
		int m=cin.nextInt();
		//Rows Print 
		//Column
		int row=1;
		int nst=m;
		while(row<=n){
			//work
			//star
			int cst=1;
			while(cst<=nst){
				if(row%2==0){
					if(cst%2!=0){
						System.out.print(".");
					}else{
						System.out.print("*");
					}
				}
				else{
					if(cst%2!=0){		
						System.out.print("*");
					}else{
						System.out.print(".");
					}
				}
				cst++;
			}
			System.out.println("");
			row++;
		}
	}
}			

