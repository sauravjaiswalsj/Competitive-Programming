import java.util.Scanner;
public class PrintSeries{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n1=cin.nextInt();
		int n2=cin.nextInt();
		int i=1,count=1;
		while(count<=n1){
                        int t=(3*i)+2;
                        if(t%n2==0){
				i++;
                                continue;
                        }else{
                                System.out.println(t);
			count++;
                        }
			i++;
                }
	}
}
