package classTask;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
public class ClassTaskTest {

    @Test
    public void testForSampleInput(){
        int [] arrays = {4,5,8,8,8,2,9};

        int [] expected = {0,1,0,0,0,0,1};
        arrays = ClassTask.getEvenOddEquivalent(arrays);
        assertArrayEquals(expected, arrays);





    }

}
