import java.util.*;
class Solution{
	public static void main(String[] agrs){
		Scanner cin=new Scanner(System.in);
		int t=new Scanner(System.in);
		while(t!=0){
			int n=cin.nextInt();
			String s=cin.nextInt();
			mazeRunner(s,n);
			t--;
		}
	}
	public static void mazeRunner(String s, int n){

