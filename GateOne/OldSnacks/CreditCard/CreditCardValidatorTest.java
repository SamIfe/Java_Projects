import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditCardValidatorTest {

	@Test
	public void testToDetermineCardTypeVisaCard() {
		String cardNumber = "4111111111111111";
        	assertEquals("VisaCard", CreditCardValidator.getCardClassification(cardNumber));
	}

	@Test
	public void testToDetermineCardTypeMasterCard() {
		String cardNumber = "5111111111111000";
        	assertEquals("MasterCard", CreditCardValidator.getCardClassification(cardNumber));
	}


	@Test
	public void testToDetermineCardTypeAmericaExpressCard() {
		String cardNumber = "37111111111111000";
       		assertEquals("AmericanExpress Card", CreditCardValidator.getCardClassification(cardNumber));
	}


	@Test
	public void testToDetermineCardTypeDiscoverCard() {
		String cardNumber = "6123456789123400";
       		assertEquals("DiscoverCard", CreditCardValidator.getCardClassification(cardNumber));	
	}

	
	@Test
	public void testToDetermineCardTypeInvalidCardType() {
       		assertEquals("InvalidCard, Unknown Types of card", CreditCardValidator.getCardClassification("1234567890123456"));

	}

	@Test
	public void testToHandleNonNumericForSpace() {
		String cardNumber = "4111 1111 1111 1111";
		assertFalse(CreditCardValidator.toHandleNonNumericInput(cardNumber));
	}



	@Test
	public void testToHandleNonNumericForSpecialCharacters() {
		String cardNumber = "4111-1111-1111-1111";
		assertFalse(CreditCardValidator.toHandleNonNumericInput(cardNumber));
	}



	@Test
	public void testToHandleNonNumericForAlphabets() {
		String cardNumber = "4111a111111111111";
		assertFalse(CreditCardValidator.toHandleNonNumericInput(cardNumber));
	}



	@Test
	public void testToHandleNonNumericForPunctuations() {
		String cardNumber = "4111.1111.1111.1111";
		assertFalse(CreditCardValidator.toHandleNonNumericInput(cardNumber));
	}



	@Test
	public void testToCheckStardardizedValidCreditCardDigitLength() {
		assertTrue(CreditCardValidator.checkValidCardLength("4111111111111111"));
	}


	@Test
	public void testToCheckThatTheCardLengthIsShorter() {
		String cardNumber = "4211";
		assertFalse(CreditCardValidator.checkValidCardLength(cardNumber));
	}



	@Test
	public void testToCheckThatTheCardLengthIsLonger() {
		String cardNumber = "42111111111112222223333333444444455556666777";
		assertFalse(CreditCardValidator.checkValidCardLength(cardNumber));
	}




}



















/* java -jar junit-platform-console-standalone-1.11.0.jar --class-path . --scan-classpath --include-classname CreditCardValidatorTest

javac -cp "junit-platform-console-standalone-1.11.0.jar" CreditCardValidatorTest.java CreditCardValidator.java
*/
