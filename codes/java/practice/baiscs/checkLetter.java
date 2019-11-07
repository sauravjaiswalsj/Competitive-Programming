import java.util.*;
import java.lang.*;
public class checkLetter{
	public static void main(String[] args){
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner cin=new Scanner(System.in);
		char c=cin.next().charAt(0);
		if(Character.isLetter(c)){
			System.out.println("Alphabet");
		}
		else if(Character.isDigit(c)){
			System.out.println("Digit");
		} else if(Character.isWhitespace(c)){
			System.out.println("WhiteSpace");
		}else{
			System.out.println(Character.toUpperCase(c));
		}
	}
}
