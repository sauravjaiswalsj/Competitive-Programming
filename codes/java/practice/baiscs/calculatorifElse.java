public class calculatorifElse{
	public static void main(String[] args){

		// create the data structures for the calculator
		double[] leftValue={10.0,9.5,6.7,8.5};
		double[] rightValue={20.5,6.5,1.5,12.15};
		char[] opcode={'a','s','d','m'};
		double[] result=new double[opcode.length];

		// calculate the result
		
		for(int i=0;i<opcode.length;i++){
			if(opcode[i]=='a'){
				result[i]=leftValue[i]+rightValue[i];
			}
			else if(opcode[i]=='s'){
				result[i]=leftValue[i]-rightValue[i];
			}
			else if(opcode[i]=='d'){
				result[i]=rightValue[i]!=0?leftValue[i]/rightValue[i]:0.0d;
			}
			else if(opcode[i]=='m'){
				result[i]=leftValue[i]*rightValue[i];
			}
			else {
				result[i]=0.0d;
			}

		}
		// for each
		for(double theResult:result){
			System.out.println("Result is:"+theResult);
		}
	}
}

