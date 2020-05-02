import java.util.*;
public class Solution {
	public static void main(String[] args){
		int[] x={14, 27, 1, 4, 2, 50, 3, 1};
		int[] y={2, 4, -4, 3, 1, 1, 14, 27, 50};
		System.out.println(solution(x,y));
	}
	
    public static int solution(int[] x, int[] y) {

        // Your code here

        if(x.length>=y.length){

            return findLeft(x,y);

        }else {

            return findRight(x,y);

        }

    }

    public static int findLeft(int[] x,int[] y){

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<x.length;i++){

            if(!set.contains(x[i]))

                set.add(x[i]);

        }

        for(int i=0;i<y.length;i++){

            if(set.contains(y[i])){

                set.remove(y[i]);

            }

        }

        for(int i:set){
		return i;
	}
	return 0;

    }//ends func

    public static int findRight(int[] x,int[] y){

        Set<Integer> set = new HashSet<Integer>();

        for(int i=0;i<y.length;i++){

            set.add(y[i]);

        }

        for(int i=0;i<x.length;i++){

            if(set.contains(x[i])){

                set.remove(x[i]);

            }

        }

        for(int i:set){
		return i;
	}
	return 0;

    }
}
