import java.util.Scanner;

class LuckyFour{
	public static void main(String[] agrs){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			long n=cin.nextLong();
			System.out.println(getCount(n));
			t--;
		}

	}
	public static int getCount(long n){
		int count=0;
		while(n!=0){
			int rem=(int)n%10;
			if(rem==4){
				count++;
			}n/=10;
		}
		return count;
	}
}
