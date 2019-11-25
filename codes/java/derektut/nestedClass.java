public class nestedClass{
	public static class data{
		int dat;
		data(){
			dat=10;
		}
	}
	public static void main(String[] args){
		data d=new data();
		System.out.print(d.dat);
	}
}
