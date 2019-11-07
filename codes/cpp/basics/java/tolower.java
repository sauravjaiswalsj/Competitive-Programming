import java.util.*;
import java.lang.*;
public class tolower{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String c=cin.nextLine();
		char[] arr=c.toCharArray();
		for(int i=0;i<=arr.length-1;i++){
			if((int)arr[i]>=65 && (int)arr[i]<=91){
				System.out.print((char)((int)arr[i]+32));
			}
		}
	}
}

