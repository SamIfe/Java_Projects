import java.util.Arrays;
public class TapSwap {
    public static void main (String...args){

	int [] arrayNumbers = {1,2,3,4,5,6};
	int [] result = swap(arrayNumbers);
	System.out.print(Arrays.toString(result));

}

public static int [] swap(int [] arrayNumbers) {
	int [] arrayToBeSwapped = new int [arrayNumbers.length];
	for(int swapp = 0; swapp < arrayNumbers.length; swapp += 2) {
	if (swapp + 1 < arrayNumbers.length) {
	
	    arrayToBeSwapped[swapp] = arrayNumbers[swapp + 1];
	    arrayToBeSwapped[swapp + 1] = arrayNumbers[swapp];

	} else {
	    arrayToBeSwapped[swapp] = arrayNumbers[swapp];
	    
		}

	   }

return  arrayToBeSwapped;
    }

}


	



