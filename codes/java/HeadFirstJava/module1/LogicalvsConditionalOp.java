public class LogicalvsConditionalOp{
	public static void main(String[] args){
		int a=55;
		int b=60;
		int c=11;

		if(a/c==5 & b>50){
			System.out.println("Success");
		}
		else{
			System.out.println("Unsuccessful $");
		}

		if(a/c==5 && b>50){
			System.out.println("Success $$");
		}
		else{
			System.out.println("Unsuccessful $$");
		}
	}
}
