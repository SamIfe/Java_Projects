import java.util.Scanner;
public class ReverseSentence{
	public static void main (String []arg){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the sentences: ");
	//String reverse = input.nextLine();
String reverse = "There is a tide in the affairs of men";

String reverseWord [] = reverse.split(" ");
String text = " ";
	for (int rev = 0; rev < reverseWord.length; rev++){
	text =  reverseWord[rev] + " " +text;
			}
		System.out.print("The reverse word is: " + text);
		}

}