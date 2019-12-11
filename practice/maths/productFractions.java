/* --[ 1, 2, 5]
 * --[ 2, 1, 6]
 * lcm --(2,1,6)
 * update num and find sum
 * gcd and divide by rsult;
 */
import java.util.Scanner;
public class productFractions{
	private static int gcd(int a,int b){
		if(b==0) return a;
		return gcd(b,a%b);
	}
	private static int getLcm(int[] den){
		int result=den[0];
		for(int i=1;i<den.length;i++){
			result=((result*den[i]))/(gcd(result,den[i]));
		}

		return result;
	}
	public static void main(String[] args){
		Scanner cin =new Scanner(System.in);
		int n=cin.nextInt();
		int[] num=new int[n];
		int[] den=new int[n];
		int lcm=0;
		for(int i=0;i<n;i++){
			num[i]=cin.nextInt();
		}
		for(int i=0;i<n;i++){
			den[i]=cin.nextInt();
		}
		lcm=getLcm(den);
		int sum=0;
		for(int i=0;i<n;i++){
			int factor=lcm/den[i];
			sum+=factor*num[i];
		}
		int factor=gcd(sum,lcm);
		int numm=sum/factor;
		int denn=lcm/factor;
		System.out.println(numm+"/"+denn);
	}
}


