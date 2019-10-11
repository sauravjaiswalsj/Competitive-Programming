import java.util.Scanner;

class SumofDigits{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		int t=scan.nextInt();
		while(t!=0){
			int num=scan.nextInt();
			System.out.println(digitAdd(num));
			t--;
		}
	}
	static int digitAdd(int num){
		int sum=0;
		while(num!=0){
			int rem=num%10;
			sum=sum+rem;
			num/=10;
		}
		return sum;
	}
}
