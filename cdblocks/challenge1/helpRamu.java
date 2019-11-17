import java.util.*;
public class helpRamu{
	public static void main(String[] args){
		Scanner cin = new Scanner(System.in);
		int test=cin.nextInt();
		while(test-->0){
			int c1=cin.nextInt();
			int c2=cin.nextInt();
			int c3=cin.nextInt();
			int c4=cin.nextInt();
			int n=cin.nextInt();
			int m=cin.nextInt();
			int[] a=new int[n];
			int[] b=new int[m];
			for(int i=0;i<n;i++)
				a[i]=cin.nextInt();
			for(int i=0;i<m;i++)
				b[i]=cin.nextInt();
			int costRick=0;
			for(int i=0;i<n;i++){
				costRick+=Math.min(a[i]*c1,c2);
			}
			costRick=Math.min(costRick,c3);
			int costCab=0;
			for(int i=0;i<m;i++){
				costCab+=Math.min(b[i]*c1,c2);
			}
			costCab=Math.min(costCab,c3);
			int finalCost=Math.min(c4,costCab+costRick);
			System.out.println(finalCost);
		}
	}
}
				
