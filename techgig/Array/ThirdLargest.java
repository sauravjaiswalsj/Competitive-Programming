import java.util.*;
public class ThirdLargest{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		int n=cin.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			list.add(cin.nextInt());
		}
		System.out.println(thirdLargest(list));
	}
	public static int thirdLargest(ArrayList<Integer> list){
		Collections.sort(list,Collections.reverseOrder());
		return list.get(2);
	}
}
