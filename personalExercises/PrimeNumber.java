import java.util.Scanner;
public class PrimeNumber{

	public static void main(String...args){

	Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number;
		number = sc.nextInt();
	int factors = 0;
		for(int counter = 1; counter <= number; counter++) {
		
		if(number % counter == 0) factors++;
		}

		System.out.println(number + " has "  + factors);

			

		
	}




}
