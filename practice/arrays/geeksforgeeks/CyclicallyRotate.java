/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

public class CyclicallyRotate {
	public static void main (String[] args) {
		Scanner cin=new Scanner(System.in);
		int t=cin.nextInt();
		while(t!=0){
            int n=cin.nextInt();
            ArrayList<Integer> list=new ArrayList<Integer>();
            for(int i=0;i<n;i++){
                list.add(cin.nextInt());
            }
            int d=n-1;
            Rotate(list,d);
            for(int i:list){
                System.out.print(i+" ");
            }
            t--;
            System.out.println();
		}
	}
	public static void Rotate(ArrayList<Integer> list, int d){
	d=d%list.size();
        reverse(list,0,d-1);
        reverse(list,d,list.size()-1);
        reverse(list,0,list.size()-1); 
	}
	public static void reverse(ArrayList<Integer> list,int low,int high){
	    while(low<high){
	        Collections.swap(list,low,high);
	        low++;
	        high--;
	    }
	}
}
