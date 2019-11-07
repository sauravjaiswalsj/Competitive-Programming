public class forEachloop{
	public static void main(String[] args){
		float[] theCals={10.0f,30.04f,56.6f};
		float sum=0.0f;
		for(float i:theCals){
			sum +=i;
		}
		System.out.println("Sum is :"+sum);
	}
}
