import java.util.Scanner;
class EnormousInputTest{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int k=cin.nextInt();
		long[] num=new long[n];
		for(int i=0;i<n;i++){
			num[i]=cin.nextLong();
		}
		int count=0;
		for(int i=0;i<n;i++){
			if(num[i]%k==0){
				count++;
			}
		}
		System.out.println(count);
	}// main ends
}//class ends
	
