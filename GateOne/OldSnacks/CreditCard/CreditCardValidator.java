import java.util.Arrays;
import java.util.Scanner;
public class CreditCardValidator{

	public static void main (String...arg) {
        	Scanner creditCard = new Scanner(System.in);

System.out.print("""

@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@




				CREDIT CARD VALIDATOR APPLICATION





@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
""");

        	System.out.println("Please enter your credit card number:");
        	String cardNumber = creditCard.nextLine();
        	CreditCardValidator.validateCard(cardNumber);


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

		} else if (cardNumber.matches("4111-1111-1111-1111")) {
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


	public static boolean isValidWithluhnModalgorithm(String cardNumber) {
	
		int totalSum = 0;
		int[] cardDigitsArray = new int[cardNumber.length()];

		for (int digitIndex = 0; digitIndex < cardNumber.length(); digitIndex++) {
			cardDigitsArray[digitIndex] = Character.getNumericValue(cardNumber.charAt(digitIndex));
		}

		for (int currentDigitIndex = cardDigitsArray.length - 1, digitPosition = 0; currentDigitIndex >= 0; currentDigitIndex--, digitPosition++) {

			int currentDigit = cardDigitsArray[currentDigitIndex];

			if (digitPosition % 2 == 1) {
				currentDigit *= 2;
                		if (currentDigit > 9) {
					currentDigit -= 9;
                	}
				}

		totalSum += currentDigit;
		}

        return totalSum % 10 == 0;
	}



	public static void validateCard(String cardNumber) {
        if (!toHandleNonNumericInput(cardNumber)) {
            return;
        }

        String cardType = getCardClassification(cardNumber);

        if (!checkValidCardLength(cardNumber)) {
            return;
        }

        boolean isValid = isValidWithluhnModalgorithm(cardNumber);
        String validityStatus = isValid ? "Valid" : "Invalid";

        printCardDetails(cardType, cardNumber, cardNumber.length(), validityStatus);
    }

	public static void printCardDetails(String cardType, String cardNumber, int cardLength, String validityStatus) {
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("** Credit Card Type: " + cardType);
		System.out.println("** Credit Card Number: " + cardNumber);
		System.out.println("** Credit Card Digital Length: " + cardLength);
		System.out.println("** Credit Card Validity Status: " + validityStatus);
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
	}


}
		