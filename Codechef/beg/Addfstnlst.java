import java.util.Scanner;

class Addfstnlst{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
	 	int t=cin.nextInt();
	 	while(t!=0){
			long num=cin.nextLong();
       			System.out.println(addDigit(num));
			t--;
	 	}
        }
	public static long addDigit(long num){
		int sum=0,fst=0;
		int lst=(int)num%10;
		while(num!=0){
			if(num<10 && num>0){
				fst=(int)num;
			}
			num/=10;
	       	}
		return lst+fst;
	}
}
