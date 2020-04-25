import java.util.io;
public class merge{
	public static void main(String[] args){
		int[] arr=[1,4,5,8,10];
		int[] arr2=[0,2,3,6,7,9];
		merge(arr,arr2);
	}
	public static merge(int[] arr,int[] arr2){
		int[] newArray=new int[arr.length+arr2.length];
		int i=0;
		int n=newArray.length;
		while(i<n){
			
