import java.util.*;
public class STRHH{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<String> name=new ArrayList<>();
		for(int i=0;i<=n;i++){
			String val=cin.nextLine();
			name.add(val);
		}
		for(String word:name){
			int k=word.length();
			//System.out.println(k);
			for(int i=0;i<k/2;i+=2){
				System.out.print(word.charAt(i));
			}
			System.out.println("");
		}
	}
}
