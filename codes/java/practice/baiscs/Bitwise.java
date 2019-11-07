public class Bitwise{
	public static void main(String[] args){
		int a=3;
		int b=6;
		int c = a | b;
		int d=a&b;
		int e=a^b;
		int g=~a & 0x0f;
		int t=0x0f;
		System.out.printf(" or %d \nand %d\nxor %d\nnot %d \n0x0f = %d",c,d,e,g,t);
	}
}	
