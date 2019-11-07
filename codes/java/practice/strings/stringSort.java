import java.util.*;
import java.lang.*;

public class stringSort{
	public static void main(String[] args){
		String[] arr={"Now","is","the","time","for","all","good","men",
			"to","come","to","the","aid","of","thier","country"};
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j].compareTo(arr[i])<0){
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
			
