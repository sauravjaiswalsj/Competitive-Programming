import java.util.Scanner;
import java.text.DecimalFormat;
class BankAtm{
	public static final Scanner cin=new Scanner(System.in);
	public static final DecimalFormat df=new DecimalFormat("#0.00");
	public static void main(String[] args){
		int amount=cin.nextInt();
		double balance=cin.nextDouble();
		if(amount%5==0 && amount<=balance-0.5){
			double bal=balance-(double)amount-0.50;
			System.out.println(df.format(bal));
		}else{
			System.out.println(df.format(balance));
		}
	}
}

