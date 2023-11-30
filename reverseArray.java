// Iterative java program to reverse an 
// array 

import java.util.Scanner;

public class reverseArray { 
	
/* Function to reverse arr[] from 
	start to end*/
	static void rvereseArray(int arr[], int start, int end) 
	{ 
		int temp; 
		
		while (start < end) 
		{ 
			temp = arr[start]; 
			arr[start] = arr[end]; 
			arr[end] = temp; 
			start++; 
			end--; 
		} 
	}	 
	
	/* Utility that prints out an 
	array on a line */
	static void printArray(int arr[], 
							int size) 
	{ 
		for (int i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 
		
		System.out.println(); 
	} 
// Driver code
public static void main(String args[]) {

    Scanner input = new Scanner(System.in);

    // Prompt the user for the size of the array
    System.out.print("Enter the size of the array: ");
    int size = input.nextInt();

    int arr[] = new int[size]; // Create an array of the specified size

    // Prompt the user to enter the elements of the array
    System.out.print("Enter " + size + " integers separated by spaces: ");
    for (int i = 0; i < size; i++) {
        arr[i] = input.nextInt();
    }

    System.out.print("Original array is: ");
    printArray(arr, size);
    rvereseArray(arr, 0, size - 1);
    System.out.print("Reversed array is: ");
    printArray(arr, size);

    input.close(); // Close the scanner when done with input
}
}
