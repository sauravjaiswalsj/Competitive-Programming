import java.util.*;
public class FibnocciPattern{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		 if(n==0){
                        System.out.print(N);
                        return;
                }
		int nrow=2;
		int nst=2;
		int a=0;
		int b=1,sum=a+b,cst;
		System.out.println(a);
		System.out.print(b+" ");
		while(nrow<=n){
			if(nst==2){
				cst=2;
			}else
				cst=1;
			while(cst<=nst){
				System.out.print(sum+" ");
				a=b;
				b=sum;
				sum=a+b;
				cst++;
			}
			System.out.println();
			nst++;
			nrow++;
		}
	}

}

