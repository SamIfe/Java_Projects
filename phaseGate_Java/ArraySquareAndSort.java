import java.util.Arrays;
public class ArraySquareAndSort{
	public static void main (String []arg){

	int result[] = {2, 1, 4, 3, 5, 9};
	int[] finalResult = squareOfArray(result);
	System.out.println(Arrays.toString(finalResult));
	int sortedArray[] = sortArrayNumbers(finalResult);
	System.out.print(Arrays.toString(sortedArray));


}
public static int[] squareOfArray(int number[]){
	int squareOfNumArray[] = new int [6];
	for (int count = 0; count <number.length; count++) {
	squareOfNumArray[count] = number[count] * number[count];


		}
	return squareOfNumArray;

	}

public static int[] sortArrayNumbers(int numArray[]) {
int arraylength = numArray.length;
 
        for (int count = 0; count < arraylength - 1; count++) {
 
            if (numArray[count] > numArray[count + 1]) {
                 int list = numArray[count];
                numArray[count] = numArray[count + 1];
                numArray[count + 1] = list;
 
                count = -1;
            }
        }
         return numArray;

    }
}