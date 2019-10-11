import java.util.*;
import java.lang.*;
class FlatLand{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
			int n=cin.nextInt();
			System.out.println(numSquare(n));
	
			t--;
		}
	}
	static int numSquare(int n){
		int su=n;
		boolean cond=true;
		int count=0;
		if(su>1){
			while(cond){
			int sqr=floorSqrt(su);
			int sub=su-(sqr*sqr);
			if(sub==1 || sub<1){
				count+=1;
				cond=false;
			}
			su=sub;	
			count+=1;
			
		}
		return count;
		}else{return su;
		}

	}
	 static int floorSqrt(int x)
    		{
        	if (x == 0 || x == 1)
        	    return x;
       		 int i = 1, result = 1;

        	while (result <= x) {
        	    i++;
        	    result = i * i;
        	}
      		  return i - 1;
    }
}

