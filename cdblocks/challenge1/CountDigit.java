import java.util.*;
public class CountDigit {
    public static void main(String args[]) {
		Scanner cin=new Scanner(System.in);
		int num=cin.nextInt();
		int n=cin.nextInt();
		System.out.println(CountFreq(num,n));
    }
	public static int CountFreq(int num,int n){
		int count=0;
		while(num!=0){
			int rem=num%10;
			if(rem==n){
				System.out.println("rem: " + rem);
				++count;
			}
			num/=10;
		}
		return count;
	}
}
