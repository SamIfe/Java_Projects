import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{
	public static void main (String...arg) {
				



	}

	public static String getCardClassification(String cardNumber) {
	
		if (cardNumber.startsWith("4")) {
           		return "VisaCard";
        	} else if (cardNumber.startsWith("5")) {
            		return "MasterCard";
        	} else if (cardNumber.startsWith("37")) {
            		return "AmericanExpress Card";
        	} else if (cardNumber.startsWith("6")) {
            		return "DiscoverCard";
        	} else {
            		return "InvalidCard, Unknown Types of card";
        	}
	}
 	
	
	public static boolean toHandleNonNumericInput(String cardNumber) {
		if (cardNumber.contains(" ")) {
			System.out.println("Spaces are not allowed, kindly input card details without space!");

			return false;

		} else if (cardNumber.matches("4111.[!@#$%^&(),.?\":{}|<>].*")) {
			System.out.println("Character(s) are not allowed, kindly input card details without characters!");

			return false;

		} else if (cardNumber.matches("4111a111111111111")) {
			System.out.println("Alphabets are not allowed, kindly input card details without space!");

			return false;


		} else if (cardNumber.matches("4111.1111.1111.1111")) {
            System.out.println("The card input has Punctuation, please kindly correct it!");

			return false;
		
		} 

		return true;

	}


	public static boolean checkValidCardLength(String cardNumber) {
		int length = cardNumber.length();
		if (length < 13) {
			System.out.println("The card input is shorter than expected, kindly imput a valid credit card number");

		return false;

		} else if (length > 16) {
            System.out.println("The card input is longer than expected,kindly imput a valid credit card number");

            return false;

		}

        return true;
	}

	

}
		