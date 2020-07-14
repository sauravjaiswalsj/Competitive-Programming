import java.io.*;

class Main{
	public static void main(String[] args)throws IOException{
		final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test=Integer.parseInt(br.readLine());
		int sum=0;
		while(test -- >0){
			int[] arr = Integer.parseInt(br.readLine().split(" "));
			int x=arr[0];
			int y=arr[1];
			int z=arr[2];
		       	sum=sum+x+y+z;
		}
		if(sum==0){
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
	}
}

	       			       
