import java.util.*;
class candies{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			long n=cin.nextLong();
			long m=cin.nextLong();
			long k=cin.nextLong();
			long can=n/m;
			long tcan=n-(can*m);
			if(tcan%k!=0){
				System.out.println((tcan/k)+1);
			}else if(tcan%k==0){
				System.out.println(tcan/k);
			}else
				System.out.println("-1");
			t--;
		}
	}
}
