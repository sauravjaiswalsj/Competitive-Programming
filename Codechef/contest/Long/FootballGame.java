import java.util.*;
class FootballGame{
public static final Scanner cin=new Scanner(System.in);
       	public static void main(String[] args){
        int testCase=cin.nextInt();
        while(testCase!=0){
            int n=cin.nextInt();
            CheckMax(n);
            testCase--;
    }
}
public static void CheckMax(int n){
    int[] a=new int[n];
    int[] b=new int[n];
    for(int i=0;i<n;i++){
        a[i]=cin.nextInt();
    }
    for(int i=0;i<n;i++){
        b[i]=cin.nextInt();
    }
//40 30 50 -> 800 600 1000
// 2 4 20  ->  20  40  200
// ------------------------
//         -> 780 560  800
// Integer.Max(780,560,880)


int maxPoint=0;
for(int i=0;i<n;i++){       // i=0 i=1 i=2
    int score=a[i]*20; // 800 600 1000
    int foul=b[i]*10; //   20  40  200
                  //----------------
    int point=score-foul;//780 560 800
    maxPoint=Integer.max(point,maxPoint); // 780 780 800
}
System.out.println(maxPoint);
}
}

