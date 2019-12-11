import java.util.Scanner;
import java.math.*;
public class MagicNumbers{
        public static void main(String[] args){
                final Scanner cin=new Scanner(System.in);
                int test=cin.nextInt();
                for(int j=0;j<test;j++){
                        int n=cin.nextInt();
                        int[] arr=new int[n];
                        for(int i=0;i<n;i++){
                                arr[i]=cin.nextInt();
                        }
                        System.out.println(findMagicNumber(arr));
                }
        }
        private static BigInteger findMagicNumber(int[] arr){
            BigInteger mul=BigInteger.ONE;
            BigInteger GCD=BigInteger.valueOf(arr[0]); 
            for(int i:arr){
                GCD=GCD.gcd(BigInteger.valueOf(i));
                mul=mul.multiply(BigInteger.valueOf(i));
            }
            BigInteger bn=new BigInteger("1000000007");
            return (mul.pow(GCD.intValue())).mod(bn);
        }
}
