import java.util.*;
public class myvar{
	public static final Scanner cin=new Scanner(System.in);
	public static void main(String[] args) throws Exception{
		int myvar=50;
		static int anothervar=100;
		System.out.println("MyVAr ="+myvar);
		myvar=anothervar;
		System.out.println("AnotherVar="+myvar);
		anothervar=200;
		System.out.println("MyVar="+myvar);
		myvar=anothervar;
		System.out.println("Another var="+myvar);
	}
}

