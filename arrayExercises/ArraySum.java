// #2 Write a java program to sum values of an array

import java.util.Arrays;
public class ArraySum{
    public static void main(String...args) {



	int [] arrayNumbers= {2,4,89,76,23,21,45};
	int total = 0;
	for (int count : arrayNumbers) {
	total += count;


	      }
	System.out.println("Array summation:" + total);

        }


}