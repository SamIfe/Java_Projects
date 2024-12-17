import java.util.Scanner;
public class ReverseSentence{
	public static void main (String []arg){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter the sentences: ");
	String reverse = input.nextLine();

String reverseWord [] = reverse.split(" ");


	System.out.print("The reverse word is: ");
	for (int rev = reverseWord.length -1; rev >= 0; rev--){

		 System.out.print(reverseWord[rev]+ " ");
	}
	
		
	}

}