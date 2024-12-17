// #3. Write a Java program to print the following grid.

import java.util.Arrays;
public class ArrayGridPrint{
    public static void main(String...args) {

	int [][] arrays = new int [20][20];
	for (int row = 0; row < 10; row++) {
	    for (int column = 0; column < 20; column++) {
	    System.out.printf("%2d", arrays[row][column], " ");
	    }
	    System.out.println();

	}
	
	
      }
}