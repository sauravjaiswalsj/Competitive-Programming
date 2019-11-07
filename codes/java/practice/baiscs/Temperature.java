// methods
// fahrenheitToCelcius() 
// @return double
// @param double -> temp in fahrenhiet
// c=(f-32)*5/9
// printTemperature() 
// @return void 
// @param double fahrenhiet
//
import java.util.Scanner;
class TemperatureConversion{
	/*
	 * Converts Fahrenheit To Celcius degress
	 * @param Fahrenheit temperature in F
	 * @return Equivalent Temperatrue in celcius
	 */
	public double fahrenheitToCelcius(double fahrenheit){
		return ((fahrenheit-32)*(5.0/9.0));
	}
	/*
	 * Prints the temperature in both Fahrenheit and Celcius degree
	 * @param Takes Fahrenheit temperature in fahrenheit
	 */
	public void PrintTemperature(double fahrenheit){
		System.out.println("Temperature in F: "+fahrenheit);
		System.out.println("Temperature in C: "+fahrenheitToCelcius(fahrenheit));
	}
}
public class Temperature{
	public static void main(String[] agrs){
		Scanner cin=new Scanner(System.in);
		int fahrenheit=cin.nextInt();
		new TemperatureConversion().PrintTemperature(fahrenheit);
	}
}
