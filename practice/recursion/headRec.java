import java.util.*;
public class headRec{
        public static void main(String[] args){
                Scanner cin=new Scanner(System.in);
        	int n=cin.nextInt();
		HeadRec(n);
	}
	public static void HeadRec(int n){
		if( n==0) return;
		HeadRec(n-1);
		System.out.println(n);
	}
}

