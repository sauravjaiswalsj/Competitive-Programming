import java.util.*;
public class NonRepeatingLetters{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String name=cin.nextLine();
		int c=-100;
		for(int i=0;i<name.length();i++){
			for(int j=i+1;j<name.length();j++){
				if(name.charAt(i)!=name.charAt(j)){
					//System.out.println(name.charAt(i)+""+name.charAt(j));
					c=j;
					break;
				}/*else{
					System.out.print("else:"+name.charAt(i)+""+name.charAt(j));
				}*/
			}
		}
		System.out.println(name.charAt(c));
	
	}
}
