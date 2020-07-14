package Pattern;
import java.util.Scanner;
import Pattern.CPTTRN2;
public class Main {
    public static void main(String[] args) {
        final Scanner cin = new Scanner(System.in);
        int test=cin.nextInt();
        int n=0,m=0;
        while(test-- >0) {
            n = cin.nextInt();
            m = cin.nextInt();
            CPTTRN2 pattern = new CPTTRN2(n,m);
        }
    }
}
