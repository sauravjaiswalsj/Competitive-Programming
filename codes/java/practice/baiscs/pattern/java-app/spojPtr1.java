import java.util.Scanner;
public class spojPtr1{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int test=cin.nextInt();
		while(test!=0){
			int l=cin.nextInt();
			int c=cin.nextInt();
			printPattern(l,c);
			test--;
		}
	}
	public static void printPattern(int row,int col){
		int r=1;
			//nt c=1;
		while(r<=row){
			int c=1;
			while(c<=col){
				if(r%2==0){
					System.out.print(".");
				}else{
					System.out.print("*");
				}
				c++;
			}
			System.out.println("");
			r++;
		}
	}
}
