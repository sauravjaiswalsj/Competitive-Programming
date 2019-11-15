public class Sortings{
	public static void main(String[] args){
		int[] arr={34,53,213,2,54,6,4,13,16,};
		//bubbleSort(arr);
		SelectionSort(arr);
		for(int i:arr){
			System.out.print(i+" ");
		}
	}
	/*
	 * This Sorting Algorithm Compares the adjacent elements and based upon the comparions swaps the elements
	 * @param takes input the whole array and sorts in the heap
	 * @complexity O(n*n)
	 */
	public static void bubbleSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
	}
	/*
	 * This sorting algorithms Selects the minimum element in the list and sort it.
	 * @param takes the array  as an input
	 * @complexity O(n*n)
	 */
	public static void SelectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){
			int min=i;
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			if(min!=i){
				int temp=arr[min];
				arr[min]=arr[i];
				arr[i]=temp;
			}
		}
	}
}
