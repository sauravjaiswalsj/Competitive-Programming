/* m , n -> m>n>0
 * Triplet=> (m^2-n^2 ,2*m*n, m^2+n^2
 * Where m2+n2 is greatest hence Hypotenous
 * and 2mn is even
 * if N is even: 
 * 	2mn=N
 *	m*n=N/2*1
 * 	m=N/2
 * 	n=1
 * else:
 * 	N!=even
 * 	N!=2mn
 * 	N=m2-n2
 * 	N=(m+n)*(m-n)
 * 	m=(N+1)/2
 * 	n=(N-1)/2
 */
import java.util.*;
public class PythgorasTriplet{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int N=cin.nextInt();
		/*if(N<1){
			System.out.println("-1");
			return;
		}*/
		int m,n;
		if(N%2==0){
			m=N/2;
			n=1;
			//m^2-n^2 , m^2+n^2
			System.out.println((int)(Math.pow(m,2)-Math.pow(n,2))+" "+(int)(Math.pow(m,2)+Math.pow(n,2)));
		}
		else{
			m=(N+1)/2;
			n=(N-1)/2;
			System.out.println((2*m*n)+" "+(int)(Math.pow(m,2)+Math.pow(n,2)));
		}
	}
}
