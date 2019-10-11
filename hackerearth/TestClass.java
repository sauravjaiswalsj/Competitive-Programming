import java.util.*;


class TestClass {
    public static final Scanner cin=new Scanner(System.in);
    public static void main(String args[] ) throws Exception {
        int n=cin.nextInt();
        while(n!=0){
            int x=readstring();
            System.out.println(x);
            n--;
        }

    }
    public static int readstring(){
        int R=0,U=0,B=0,Y=0;
	cin.next();
        String s=cin.nextLine();
        for(int i=0;i<s.length;i++){
	char[] a=s.charAt(i);
	}
	for(int i=0;i<a.length;i++){
		System.out.println(a[i]);
	}
        for(int i=0;i<a.length;i++){
            if(a[i]=='r'){
                R++;
            }       
            else if(a[i]=='u'){
                U++;
            }
            else if(a[i]=='b'){
                B++;
            }
            else if(a[i]=='y'){
                Y++;
            }
        }
        
    if((R>U)&&(U>B)&&(B>Y)){
            return R;
        }
        else if((U>R)&&(R>B)&&(B>Y)){
            return U;
        }
        else if((B>R)&&(R>U)&&(U>Y)){
            return B;
        }
        else if((Y>R)&&(R>U)&&(U>B)){
            return Y;
        }
        else{
            return 0;
        }
    }
}

