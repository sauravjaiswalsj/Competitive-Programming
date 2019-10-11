import java.util.Scanner;

class SecondLargest{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			long a=cin.nextLong();
			long b=cin.nextLong();
			long c=cin.nextLong();
			System.out.println(getSecondLargest(a,b,c));
			t--;
		}
	}
	public static long getSecondLargest(long a,long b, long c){
		if(a>b && a>c){
			if(b>c){
				return b;
			}else{
				return c;
			}
		}else if(b>a && b>c){
			if(a>c){
				return a;
			}else return c;
		}else if(c>a && c>b){
			if(a>b){
				return a;
			}else return b;
		}else{
			return a;
		}
	
	}
}
