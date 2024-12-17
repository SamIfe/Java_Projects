package classTask;

import java.util.Arrays;

public class ClassTask {

    public int [] getEvenOddEquivalent(int [] arrays){
        return Arrays.stream(arrays).map(x-> x%2).toArray();
    }
}
