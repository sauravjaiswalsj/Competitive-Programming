import java.util.*;
public class ElementDeletion{
	public static void main(String[] args){
		int[] array={1,2,3,4,5,6,7};
		//System.out.println(array.length);
		array=removeArray(array,4);
		 //System.out.println(array.length);
		for(int i:array){
			System.out.print(i+" ");
		}
	}
	/*
	 * This function removes the element from the list
	 * @param takes the array and the element that has to be removed
	 */
	public static int[] removeArray(int[] array,int key){
		int[] arr=new int[array.length-1];
		int j=0;
		for(int i=0;i<array.length;i++){
			if(array[i]==key){
				continue;
			}
			arr[j]=array[i];
			//System.out.println(array[i]+"->"+arr[j]+"->"+i+"->"+j);
			j++;
		}
		return arr;
		
	}
		
}
