/* Write a program that prompts the user to
enter an integer and determines whether it is divisible by 4*/

import java.util.Scanner;

public class NumberDivisibleBy4 {

	public static void main(String [] args){
	
			Scanner integer = new Scanner (System.in);

		System.out.print("Enter a number: ");
		
		int number;
		number = integer.nextInt();

		if(number % 4 == 0) {

		System.out.println("The number " + number + " is divisible by 4");

		} else {

		System.out.println("The number " + number + " is not divisible by 4");
		}

			

	
		}


}