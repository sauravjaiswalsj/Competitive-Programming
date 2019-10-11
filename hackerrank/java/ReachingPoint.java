import java.util.*;
import java.lang.*;
public class ReachingPoint{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args){
		int x1=cin.nextInt();
		int x2=cin.nextInt();
		int y1=cin.nextInt();
		int y2=cin.nextInt();
		
		if((x2<x1)||(y2<y1)){
			System.out.println("No");
		}
		else{
			System.out.println(finding(x1,y1,x2,y2));
		}
	}
	public static String finding(int x1,int y1,int x2,int y2){
		int c=0,sum=0,max;
		max=Math.max(x2,y2);
		System.out.println(max);
		while(sum<max){
		System.out.println("ak");
			sum=x1+y1;
			if(sum==x2){
				c++;
				x1=sum;
			     System.out.println("1");
			}
			else if(sum==y2){
				c++;
				y2=sum;
				System.out.println("2");
			}
			if(c==2)
				break;
		}
		System.out.println(c);
		if(c==2){
			return "Yes";
		}
		else{
			return "No";
		}
	}
}
