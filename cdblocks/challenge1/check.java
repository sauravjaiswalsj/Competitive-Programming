import java.util.*;
class check{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
	int base=cin.nextInt();
	int n=cin.nextInt();
	String d;
	if(base ==16)
   	  	d=cin.nextLine();
	int dec=0;
	if(base ==2 ) dec=Integer.parseInt(n,2);
	if(base ==8) dec=Integer.parseInt(n,8);
	if(base ==16) dec=Integer.parseInt(d,16);
  	System.out.println(dec);
	
	}
}
