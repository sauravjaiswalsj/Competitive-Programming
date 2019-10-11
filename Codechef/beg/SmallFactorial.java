import java.util.Scanner;
class SmallFactorial{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			int c=cin.nextInt();
			System.out.println(fact(c));
			t--;
		}
	}
	public static long fact(int n){
		long fc=1;
		for(int i=2;i<=n;i++){
			fc*=(long)i;
		}
		return fc;
	}
}
