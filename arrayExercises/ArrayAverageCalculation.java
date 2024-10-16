// #4. Write a Java program to calculate the average value of array elements.

import java.util.Arrays;
public class ArrayAverageCalculation{
    public static void main(String...args) {

	int [] arrayNumbers = {22,12,32,5,4,6,8,9,2,10};
        int total = 0;
	double average = 1;
	for (int count = 0; count < arrayNumbers.length; count++) {
	total += arrayNumbers[count];

	  }
	average = total / arrayNumbers.length;
	

	 System.out.println("Total and average of the arrayNumber is: Total: " +  total + " " + "Average: " + average);

      }
}

