import java.util.*;
public class anagram{
	public static void main(String[] agrs){
		Scanner cin=new Scanner(System.in);
		String a=cin.nextLine();
		String b=cin.nextLine();
		if(anagram(a,b)){
			System.out.println(a+" and "+b+" are anagrams.");
		}else{
			System.out.println(a+" and "+b+" are not anagrams.");
		}
	}
	public static boolean anagram(String a,String b){
		char[] arr=a.toCharArray();
		char[] brr=b.toCharArray();
		Arrays.sort(arr);
		Arrays.sort(brr);
		if(Arrays.equals(arr,brr)){
			return true;
		}
		else{
			return false;
		}
	}
	

}

