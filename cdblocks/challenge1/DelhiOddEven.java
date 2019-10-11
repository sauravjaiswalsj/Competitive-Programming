import java.util.*;
public class DelhiOddEven{
    public static void main(String args[]) {
        Scanner cin = new Scanner(System.in);
        int n=cin.nextInt();
        ArrayList<Integer> cars=new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            int car=cin.nextInt();
            cars.add(car);
        }
        for(int i:cars){
            int Osum=getOddSum(i);
            int Esum=getEvenSum(i);
            if(Osum%3==0 || Esum%4==0){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
    public static int getOddSum(int digit){
        int sum=0;
        while(digit!=0){
            int rem=digit%10;
            if(rem%2!=0){sum+=rem;}            
            digit/=10;
        }
        return sum;
    }

    public static int getEvenSum(int digit){
        int sum=0;
        while(digit!=0){
            int rem=digit%10;
            if(rem%2==0){sum+=rem;}            
            digit/=10;
        }
        return sum;
    }
}
