import java.util.Scanner;
public class pat4{
        public static void main(String[] args){
                Scanner cin=new Scanner(System.in);
                int n=cin.nextInt();
                int row=1;
                while(row<=n){//work
                        int cs=1;
			char a='A';
                        while(cs<=n){
                                System.out.print(a);
                                a++;
				cs++;
                        }//prep
                        System.out.println("");
                        row++;
                }
        }
}
