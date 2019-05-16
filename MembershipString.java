import java.util.Scanner;
class MembershipString{
	public static void main(String[] args){
		Scanner cin=new Scanner(System.in);
		String s1=cin.nextLine();
		char c=cin.next().charAt(0);
		int i=0;
		boolean check=false;
		while(i<s1.length()){
			if(s1.charAt(i)==c){
				check=true;
			}

			i++;	
		}
		if(check){
			System.out.print("Yes");
		}
		else{
			System.out.println("No");
		}
	}
}
