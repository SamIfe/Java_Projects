import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

	public class TapSwapTest {

	@Test

	public void testTapSwapNumber() {
	// Given
	int [] arrayNumbers = {1,2,3,4,5,6};
	
	// When
	int [] outputResult = TapSwap.swap(arrayNumbers);

	// Check
	int [] expected = {2,1,4,3,6,5};
	assertArrayEquals(expected, outputResult);




	}

}
