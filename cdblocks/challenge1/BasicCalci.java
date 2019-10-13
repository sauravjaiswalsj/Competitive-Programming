import java.util.*;
public class BasicCalci {
    public static void main(String args[]) {
        // Your Code Here
        Scanner cin=new Scanner(System.in);
	
        char ch;
        do{
            ch=cin.next().charAt(0);
            int a=cin.nextInt();
            int b=cin.nextInt();
            switch(ch){
                case '+':
                    System.out.println(a+b);
                    break;
                case '-':
                    System.out.println(a-b);
                    break;
                case '*':
                    System.out.println(a*b);
                    break;
                case '/':
                    System.out.println(a/b);
                    break;
                case '%':
                    System.out.println(a+b);
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
            }   
        }while(ch!='X'||ch!='x');    
    }
}

