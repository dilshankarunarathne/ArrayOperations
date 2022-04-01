import java.util.Scanner;

class arrayOperations {
	// Implement the method to insert the numbers into the array (Get the numbers from the user.)
	public static void fillArray(int [] array) {
		Scanner scanner = new Scanner(System.in) ;
		System.out.println ("Type all " + array.length + " integers seperated by spaces.") ;
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
		for (int i=array.length-1; i>=0; i--) {
			System.out.print (array [i] + " ") ;
		}
	}
	
	// Implement the method to search a specific number from the array
	public static void Search(int [] array, int number) {
		for (int i=0; i<array.length; i++) {
			if (array [i] == number) {
				System.out.println ("Found number " + number + " at index " + i);
			}
		}
		System.out.println ("Number " + number + " was not found in the array.") ;
	}
	
	// Implement the method to find the maximum number from the array
	public static void Maximum(int [] array) {
		int max = array [0] ;
		for (int i=1; i<array.length; i++) {
			if (max < array [i]) {
				max = array [i] ;
			}
		}
		System.out.println ("Maximum number in the array is " + max) ;
	}
	
	// Implement the method to find the minimum number from the array
	public static void Minimum(int [] array) {
		int min = array [0] ;
		for (int i=1; i<array.length; i++) {
			if (min > array [i]) {
				min = array [i] ;
			}
		}
		System.out.println ("Minimum number in the array is " + min) ;
	}
	
	// Implement the method to retrieve a number at specific index
	public static void getElement(int [] array, int index) {
		System.out.println ("Element at " + index + " is " + array [index]) ;
	}
	
	// Implement the method to replace a number at specific index
	public static void replaceElement(int [] array, int index, int replaceWith) {
		System.out.print ("Element at " + index + ": " + array [index]) ;
		array [index] = replaceWith ;
		System.out.print (" was replaced with " + replaceWith + "\n") ;
	}

	// Implement the method to sort the array in ascending order
	public static void sortArrayASC(int [] array) {
		for (int i=0; i<array.length; i++) {
			int currentMinIndex = i ;
			for (int j=i+1; j<array.length; j++) {
				if (array [j] < array [currentMinIndex]) {
					currentMinIndex = j ;
				}
			}

			int temp = array [i] ;
			array [i] = array [currentMinIndex] ;
			array [currentMinIndex] = temp ;
		}

		System.out.println ("Sorted array [ASC] :") ;
		for (int i=0; i<array.length; i++) {
			System.out.print (array [i] + " ") ;
		}
	}

	// Implement the method to delete (set to zero) all the elements in the array
	public static void Delete(int [] array) {
		for (int i=0; i<array.length; i++) {
			array [i] = 0 ;
		}
	}
}