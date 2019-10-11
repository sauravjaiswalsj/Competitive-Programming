import java.util.*;
class TestClass1{
    public static final Scanner cin=new Scanner(System.in);
    public static void main(String[] args){
        int sum,c=0;
        int n=cin.nextInt();
        cin.next();
        String s=cin.nextLine();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                //c++;
		System.out.println(s.charAt(i));
            }
        }
	System.out.println(c);
        sum=n-c;
	System.out.println(sum);
        System.out.println(sum+1);
    }
}
