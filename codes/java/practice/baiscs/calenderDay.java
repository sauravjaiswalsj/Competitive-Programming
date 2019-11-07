import java.util.Scanner;
import java.util.Calendar;
import java.time.DayOfWeek;

public class calenderDay{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Calendar rightNow = Calendar.getInstance();
        int date=sc.nextInt();
        DayOfWeek day=new DayOfWeek(date);
        System.out.println(rightNow.get(Calendar.DATE));
    }
}

