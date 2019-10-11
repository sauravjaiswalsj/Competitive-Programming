import java.util.*;
//import java.lang.*;
//import java.io.*;
public class allen{
	static void hack(){
		Scanner cin=new Scanner(System.in);
		int d=cin.nextInt();
		String sh=cin.nextLine();
		char[] ch=sh.toCharArray();
		for(int i=0;i < ch.length-1;i++){
			System.out.println(ch[i]);
		}	
		System.out.println(d);
	

	}
	
	public static void main(String[] args){
	
		int n;
		Scanner cin=new Scanner(System.in);
		n=cin.nextInt();
		while(n!=0){
			hack();
			n--;
		}
	}
}
