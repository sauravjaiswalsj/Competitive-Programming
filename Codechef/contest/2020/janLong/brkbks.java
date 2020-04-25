/*
 * @author: sauravjaiswalsj
 */
import java.util.*;
public class brkbks{
	public static void main(String[] args){
                final Scanner cin = new Scanner(System.in);
                int test=cin.nextInt();
                while(test-->0){
                        int s = cin.nextInt();
                        int w1 = cin.nextInt();
                        int w2 = cin.nextInt();
                        int w3 = cin.nextInt();
                        System.out.println(BreakingBricks(s,w1,w2,w3));
                }
	}
	/*
	 * @params takes the strength and widths
	 * @return the number of hits needed to break the bricks
	 */
	public static int BreakingBricks(int s,int w1,int w2,int w3){
		int step=0;
		if(s>=(w1+w2+w3)){
			return 1;
		}
		else if(s>=w1+w2 && s>=w3){
			System.out.println("1");
			return 2;
		}
		else {
			int sum=w1+w3;
			if(s==sum){
				step++;
			}
			if(s>=w2){
				step++;
			}
		}
		return step;
	}
}
