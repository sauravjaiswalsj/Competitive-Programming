import java.util.Scanner;
public class IncreasingDecreasingSequence{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		if(n==0){
			System.out.println(false);
			return;
		}
		int[] array=new int[n];
		for(int i=0;i<n;i++){
			array[i]=cin.nextInt();
		}
		if(checkSortedInc(array)==true || (checkSortedDec(array)==true || checkSortedDecInc(array))){
			System.out.println("true");
		}else{
			System.out.println("false");
		}
	}
	public static boolean checkSortedInc(int[] array){
		for(int i=1;i<array.length;i++){
			if(array[i-1]>array[i]){
				return false;
			}
		}
		return true;
	}
	public static boolean checkSortedDec(int[] array){
                for(int i=0;i<array.length-1;i++){
                        if(array[i]<array[i+1]){
                                return false;
                        }
                }
                return true;
        }
	//3 2 1 2 3
	public static boolean checkSortedDecInc(int[] array){
                int j=0;
		boolean check=false;
		for(int i=0;i<array.length-1;i++){
                        if(array[i]<array[i+1]){
                                check=true;
                        }
			else{
				j=i;
				check=false;
				break;
				
			}
		}
		//System.out.println(j);
		for(;j<array.length-1;j++){
			if(array[j+1]>array[j]){
				check=true;
			}else{
				check=false;
			}
		}
		if(check==true){
               		return true;
		}else{
			return false;
		}
        }

}
