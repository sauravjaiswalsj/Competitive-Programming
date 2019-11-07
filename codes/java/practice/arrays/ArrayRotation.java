import java.util.Collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.io.*;
public class ArrayRotation{
	public static void main(String[] args)throws IOException{
		BufferedReader cin= new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(cin.readLine());
		ArrayList<Integer> list=new ArrayList<>();
		for(int i=0;i<n;i++){
			int val=Integer.parseInt(cin.readLine());
			list.add(val);
		}
		int d=Integer.parseInt(cin.readLine());
		Collections.rotate(list,(-d));
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			int i=(Integer)itr.next();
			System.out.print(i+" ");
		}
	}
}
