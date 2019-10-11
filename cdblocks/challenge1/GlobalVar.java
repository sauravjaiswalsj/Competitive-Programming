public class GlobalVar{
	public static int val=20;
	public static void main(String[] args){
		System.out.println(val);
		//int val=200;
		System.out.println(val);
		System.out.println(GlobalVar.val);
		GlobalVar.val=2001;
		System.out.println(val);
	}
}
