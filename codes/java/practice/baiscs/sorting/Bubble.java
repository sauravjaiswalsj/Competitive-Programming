public class Bubble{
	public static void main(String[] args){
		int[] arr={88,66,55,44,22};
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr.length-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;

				}
			}
		}
		for(int i:arr){
			System.out.println(i);
		}
	}
}
