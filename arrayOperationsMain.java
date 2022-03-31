import java.util.Scanner;

class arrayOperationsMain {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		arrayOperations op = new arrayOperations(); // useless because all methods are static
		
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		
		int [] array = new int[size];

		arrayOperations.fillArray(array) ;

		arrayOperations.printArray(array) ;

		arrayOperations.printReverse(array) ;

		arrayOperations.Search(array, 5) ;

		arrayOperations.Maximum(array) ;

		arrayOperations.Minimum(array) ;

		arrayOperations.getElement(array, 2) ;

		arrayOperations.replaceElement(array, 3, 44) ;

		arrayOperations.sortArrayASC(array) ;

		arrayOperations.Delete(array) ;
	}
}