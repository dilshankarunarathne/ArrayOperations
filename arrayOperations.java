import java.util.Scanner;

class arrayOperations {
	// Implement the method to insert the numbers into the array (Get the numbers from the user.)
	public static void fillArray(int [] array) {
		Scanner scanner = new Scanner(System.in) ;
		for (int i=0; i<array.length; i++) {
			array [i] = scanner.nextInt() ;
		}
	}
	
	// Implement the method to display the numbers of the array
	public static void printArray(int [] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print (array [i] + " ") ;
		}
	}
	
	// Implement the method to display the numbers reversely
	public static void printReverse(int [] array) {
		for (int i=array.length-1; i<0; i--) {
			System.out.print (array [i] + " ") ;
		}
	}
	
	// Implement the method to search a specific number from the array
	public static void Search() {
		// Code here.....
	}
	
	// Implement the method to find the maximum number from the array
	public static void Maximum() {
		// Code here.....
	}
	
	// Implement the method to find the minimum number from the array
	public static void Minimum() {
		// Code here.....
	}
	
	// Implement the method to retrieve a number at specific index
	public static void getElement() {
		// Code here.....
	}
	
	// Implement the method to replace a number at specific index
	public static void replaceElement() {
		// Code here.....
	}
	
	// Implement the method to sort the array in ascending order
	public static void sortArrayASC() {
		// Code here.....
	}
	
	public static void Delete() {
		// Code here.....
	}
}