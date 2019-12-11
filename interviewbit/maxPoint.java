import java.util.Scanner;
public class maxPoint{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0;i<n;i++){
			x[i]=cin.nextInt();
		}
		for(int i=0;i<n;i++){
                           y[i]=cin.nextInt();
  	        }
		System.out.println(maxCount(x,y));
	}
	private static int maxCount(int[] x,int[] y){
		int count=1,newSlope=0;
		int slope=(y[1]-y[0])/(x[1]-x[0]);
		for(int i=1;i<x.length;i++){
			try{
			newSlope=((y[i]-y[0])/(x[i]-x[0]));
			}
			catch(Exception e){
				newSlope=((y[i]-y[1])/(x[i]-x[1]));
			}
			if(newSlope==slope){
				count++;
			}
		}
		return count;
	}
}
