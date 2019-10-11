import java.util.Scanner;

class ReverseNumber{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int t=cin.nextInt();
		int num,rvalue;
		while(t!=0){
			num=cin.nextInt();
			System.out.println(reverse(num));
		}
	}
	public static int reverse(int num){
		int sum=0;
		while(num!=0){
			int rem=num%10;
			sum=sum*10+rem;
			num/=10;
		}
		return sum;
	}
}

