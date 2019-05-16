import java.util.*;
class CandidateCode{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int t=cin.nextInt();
		while(t!=0){
			int n=cin.nextInt();
			gameBlock(n);
			t--;
		}
	}
	public static void gameBlock(int n){
		 int[] st=new int[n];
                 int[] en=new int[n];
		 for(int i=0;i<n;i++){
			 st[i]=cin.nextInt();
		 }
		 for(int i=0;i<n;i++){
			 en[i]=cin.nextInt();
		 }
		 int sums=0,sume=0;
		 Arrays.sort(st);
		 Arrays.sort(en);
		 int count=0;
		 for(int i=0;i<n;i++){
			// sums=sums+st[i];
			//sume=sume+en[i];
			//System.out.println(st[i]+ " " + en[i]);
			if(en[i]>=st[i]){
				count++;
			}
		 }
		if(count==n){
			System.out.println("WIN");
		}
		else{
			System.out.println("LOSE");
		}
	}
	
}

