import java.util.Scanner;

public class NumberDivisibleBy4And5{

	public static void main(String [] args){
	
			Scanner numb = new Scanner (System.in);

		System.out.print("Enter a number: ");
		
		int number;
		number = numb.nextInt();
		
		if(number % 4 == 0 || number % 5 == 0){
		
		System.out.println("The number " + number + " is divisible by 4 and 5");
		
		} else {

		System.out.println("The number " + number + " is not divisible by 4 and 5");
		}
		
	}

}
		
