/* package whatever; // don't place package name! */  
 
import java.util.*;
import java.lang.*;
 
class Guvi
{
public static void main (String[] args) throws java.lang.Exception 
  { 
   // your code goes here 
  	Scanner cin=new Scanner(System.in);
   	String s=cin.nextLine();
 	String inp=Lexicographically(s);
  	System.out.println(inp);
   } 
  static int i=1;
  public static String Lexicographically(String s){
    System.out.println(i);
    char[] name=s.toCharArray();
    if(i<name.length-1){
   	 char temp=name[i];
   	 name[i]=name[i+1];
   	 name[i+1]=temp;
    }
    i++;
    String n=new String(name);
    System.out.println(n);
    if(n.compareTo(s)>0){
      return n;
    }else if(n.compareTo(s)<0){
    	return Lexicographically(n);
    }else{
    	return "-1";
    }
  }
 } 
