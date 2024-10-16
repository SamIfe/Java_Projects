// Exercise 1. Write a Java program to sort a numeric array and a string array.

import java.util.Arrays;
public class ArraySorting{
    public static void main(String...args) {

	int [] arrayList = {2,3,1,4,5,6,9,54,32,56,78};
	String [] arrayList2 = {"java", "Python", "C Programming", "PHP", "C#"};

	System.out.println("Print original numeric Array: " + Arrays.toString(arrayList));
	Arrays.sort(arrayList);
	System.out.println("Sorted numeric Array: " + Arrays.toString(arrayList));


	System.out.println("Print original String Array: " + Arrays.toString(arrayList2));
	Arrays.sort(arrayList2);
	System.out.print("Sorted String Array: " + Arrays.toString(arrayList2));

	


      }
}