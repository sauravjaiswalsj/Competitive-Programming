import java.util.*;
public class fibdp{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		System.out.println(fibrec(n));
	}
	public static int fibrec(int n){
		int[] f=new int[n+2];
		f[0]=0;
		f[1]=1;
		for(int i=2;i<=n;++i){
			f[i]=f[i-1]+f[i-2];
		}
		return f[n];
	}
}
