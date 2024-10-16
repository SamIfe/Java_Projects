//# 5. Write a Java program to test if an array contains a specific value.



import java.util.Arrays;
public class ContainAValue{
    public static void main(String...args) {

	int [] arrayNum = {2013,2019,3045,1430,2,90,78,55};
	boolean result = containValue(arrayNum, 888);
	System.out.println(result);

	



}



public static boolean containValue(int [] array, int numValue) {
    for (int check = 0; check < array.length; check++) {
	if (numValue == array[check]) {
	return true;


	    }
	}
	return false;

    }
}