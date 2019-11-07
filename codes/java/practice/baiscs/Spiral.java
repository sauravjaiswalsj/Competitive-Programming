import java.util.*;
public class Spiral{
public static void main(String[] args){
    Scanner cin = new Scanner(System.in);
    int n=cin.nextInt();
    int[][] arr=new int[n][n];
    int val=0;
    int top=0,left=0,right=n-1,bottom=n-1;
    while(left<=right && top<=bottom){
        for(int i=left;i<=right;i++){
            arr[top][i]=++val;
        }
        top++;
        for(int i=top;i<=bottom;i++){
            arr[i][right]=++val;
        }
        right--;
	if(top<=bottom){
        for(int i=right;i>=left;i--){
            arr[bottom][i]=++val;
        }
        bottom--;
	}
	if(left<=right){
        for(int i=bottom;i>=top;i--){
        arr[left][i]=++val;
        }
        left++;
	}
    }
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print(arr[i][j]+" ");
        }
            System.out.println("");
        }
	}
}

