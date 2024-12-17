package sortChalenges;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingChalengesTest {

    @Test
    public void quicksortTest() {
        //When
        int [] numbers = {9 ,2, 1, 7, 4};
        int start = 0;
        int end = numbers.length - 1;
        //When
        SortingChallenges.quicksort(numbers, start, end);
        //Check
        int [] expected = {1, 2, 4, 7, 9};
        assertArrayEquals(expected, numbers);
    }
    @Test
    public void findMaxProductTest() {
        // Given
        int [] numbers = {7, 8, 2, 9, 1};
        // When
        numbers = SortingChallenges.findMaxProduct(numbers);
        // Expected
        int [] expected = {7, 9};
        assertArrayEquals(expected, numbers);

    }
}