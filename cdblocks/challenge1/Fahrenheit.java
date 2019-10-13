import java.util.*;
public class Fahrenheit{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int min=cin.nextInt();
		int max=cin.nextInt();
		int interval=cin.nextInt();
		for(int i=min;i<=max;i+=interval){
			int c=(int)((5.0/9.0)*(i-32));
			System.out.println(i+" "+c);
		}
	}	
}
