import java.util.Scanner;
public class pat19{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int nr=2*n-1;
		int row=1;
		int nst=1;
		int c=1;
		while(row<=nr){
			//work
			int cst=1;
			while(cst<=nst){
				if(cst%2==0){
					System.out.print("*");
				}
				else{
					System.out.print(c);
				}
				cst++;
			}
			//prep
			System.out.println("");
			if(row<=nr/2){
				nst+=2;
				c++;
			}
			else{
				nst-=2;
				c--;
			}
			row++;
		}
	}
}
