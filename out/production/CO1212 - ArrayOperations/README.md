# Array Operations
Download this two java files and implement the methods which are mentioned inside 
the class. Just use the basic things that I have taught you in the lectures.  
In the next lectures you will be asked to share and explain the codes.

## Interface to implement


    // Implement the method to insert the numbers into the array 
    (Get the numbers from the user.)
    public static void fillArray() {
    // Code here.....
    }

    // Implement the method to display the numbers of the array
    public static void printArray() {
        // Code here.....
    }
    
    // Implement the method to display the numbers reversely
    public static void printReverse() {
        // Code here.....
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

## Tests

    import java.util.Scanner;

    class arrayOperationsMain {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            arrayOperations op = new arrayOperations();
    
            System.out.println("Enter the size of the array");
            int size = sc.nextInt();
            
            int array[] = new int[size];
            
            // Call the methods here......
        }
    }

## What I did...
I implemented the methods ~ ***La Basica*** in the original file. But I also created a seperate
package containing another implementation, which is **good**. 