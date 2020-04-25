import java.util.Scanner;
import java.util.ArrayList;
import java.text.DecimalFormat;
public class reverseRoot{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("0.0000");
		ArrayList<Long> arr=new ArrayList<Long>();
		while(cin.hasNextLong()){
			arr.add(cin.nextLong());
		}
		for(int i=arr.size()-1;i>=0;i--){
			System.out.println(df.format(Math.sqrt(arr.get(i))));
		}
	}
}
			
