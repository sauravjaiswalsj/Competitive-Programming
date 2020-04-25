import java.util.Scanner;
public class arraySum{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		//int n=cin.nextInt();
		int[] arr={1,2,3,4,5};
		System.out.println(sum(arr));
	}
	public static int add=0,id=0;
	public static int sum(int[] arr){
		if(id>arr.length){
        	    return 0;
  	     	 }
		if(id<arr.length)
	         	add+=arr[id];
       		 id+=1;
       		 sum(arr);
    		 return add;
	}
}
