import java.util.*;
public class Problem1{
	public static final Scanner cin=new Scanner(System.in);
        public static void countCurrency(long amount)
	       
	    {
        	 int[] notes = new int[]{100, 20, 10, 5, 1 };
       		 long[] noteCounter = new long[9];   
           for (int i = 0; i < 5; i++) {
            if (amount >= notes[i]) {
                noteCounter[i] = amount / notes[i];
		System.out.println("note counter: " +noteCounter[i]);
                amount = amount - noteCounter[i] * notes[i];
		System.out.println("amount : "+amount);
            }
        }
       long sum=0;
        

        for (int i = 0; i < 5; i++) {
            if (noteCounter[i] != 0) {
                sum=sum+noteCounter[i];
     	    }
        }
	System.out.println(sum);
    }
     
    // driver function 
    public static void main(String argc[]){
        long amount=cin.nextInt();
        countCurrency(amount);
    }
}
