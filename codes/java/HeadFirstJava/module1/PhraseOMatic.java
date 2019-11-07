import java.util.*;

public class PhraseOMatic{
	public static void main(String[] args){
		//Generate the words through which we can form the phares by combining the words
		String[] wordPair1={"hello","nice","good","have", "greetins"};
		String[] wordPair2={"Sir","mam","to","heya","hola","jhola"};
		String[] wordPair3={"Sunday","monday","tuesday","wednesday","thrusday","Friday"};
		
		// calculate the lenght of the String array
		int wordPair1Length=wordPair1.length;
		int wordPair2Length=wordPair2.length;
		int wordPair3Length=wordPair3.length;

		//Generate the random number which can be used to form the pairs
		// Use the Random  function to generate the random number
		// A random function generates number between 0.0 to 0.9
		int randWord1=(int)(Math.random()*wordPair1Length);
		int randWord2=(int)(Math.random()*wordPair2Length);
		int randWord3=(int)(Math.random()*wordPair3Length);

		// Now generate the phrase
		System.out.println(wordPair1[randWord1]+" "+wordPair2[randWord2]+" "+wordPair3[randWord3]);
	}
}

