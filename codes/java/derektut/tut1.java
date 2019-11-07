public class tut1{

	// if we want to make a const we need to use word final 
	// Static variable can be accesed by any method in the same class
	static final double PIN=3.14d;
	static String randomWords="String to print";
	public static void main(String[] args){
		System.out.println(randomWords);
		hello();
	}
	public static void hello(){
		System.out.println(PIN);
	}
}
