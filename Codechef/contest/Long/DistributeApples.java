/*@author Sauravjaiswalsj
 */

import java.util.*;
class DistributeApples{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		Stack<Integer> s1=new Stack<>();
		Stack<Integer> s2=new Stack<>();
		int test_case=cin.nextInt();
		while(test_case!=0){
			int  n=cin.nextInt();// Apples
			int k=cin.nextInt();// Boxes
			if(k!=1){
				player1(s1,n,k);
				player2(s2,n,k);
				System.out.println(distribute(s1,s2));
			}else{
				System.out.println("NO");
			}
			test_case--;
		}
	}
	public static void player1(Stack<Integer> s1, int n, int k){
		while(n<=0){
			n=n-k;
			s1.push(n);
		}
	}
	public static void player2(Stack<Integer> s2, int n, int k){
		while(n<=0){
			int val=n-k;
			if(val==0){
				s2.push(n);
			}else{
				s2.push(n-val);
			}
		}
	}
	public static String distribute(Stack<Integer> s1, Stack<Integer> s2){
		int count=1;
		while(s1.empty() && s2.empty()){
			int val1=s1.pop();
			int val2=s2.pop();
			if(val1!=val2){
				count=-1;
			}
		}
		if(count==1){
			return "YES";
		}else{
			return "NO";
		}
	}
}

