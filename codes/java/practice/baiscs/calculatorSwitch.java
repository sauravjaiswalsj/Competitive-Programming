public class calculatorSwitch{
	public static void main(String[] args){
		// create the suitable dataStructures

		double[] leftValue={85.5,6.5,98.5,4.3};
		double[] rightValue={47.5,65.96,5.6,45.6};
		char[] opcode={'a','s','d','m'};
		double[] result=new double[opcode.length];

		for(int i=0;i<opcode.length;i++){
			switch(opcode[i]){
				case 'a':
					result[i]=leftValue[i]+rightValue[i];
					break;
				case 's':
					result[i]=leftValue[i]-rightValue[i];
					break;
				case 'd':
					result[i]=rightValue[i]!=0?leftValue[i]/rightValue[i]:0.0d;
					break;
				case 'm':
					result[i]=leftValue[i]*rightValue[i];
					break;
				default:
					System.out.println("oops! You entered a wrong choice");
					result[i]=0.0d;
					break;
			}//ends switch
		}//ends for

		for(double theResult: result){
			System.out.println("Result is :"+theResult);
		}//ends for each
	}//ends main
}//ends class
