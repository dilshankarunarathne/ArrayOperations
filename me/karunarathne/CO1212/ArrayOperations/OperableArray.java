package me.karunarathne.CO1212.ArrayOperations;

public class OperableArray implements Operations {
    int [] baseArray ;
    int length ;

    public OperableArray (String inputString) {
        String [] arr = inputString.split(" ");
        length = arr.length ;
        baseArray = new int [length] ;
        for (int i=0; i<length; i++) {
            baseArray [i] = Integer.parseInt(arr [i]) ;
        }
    }

    // Implement the method to display the numbers of the array
    public void printArray() {
        for (int i=0; i<length; i++) {
            System.out.print (baseArray [i] + " "); ;
        }
        System.out.println () ;
    }

    // Implement the method to display the numbers reversely
    public void printReverse() {
        for (int i=length-1; i>=0; i++) {
            System.out.print (baseArray [i] + " "); ;
        }
        System.out.println () ;
    }

    // Implement the method to search a specific number from the array
    public static void Search() {

    }

    // Implement the method to find the maximum number from the array
    public static void Maximum() {

    }

    // Implement the method to find the minimum number from the array
    public static void Minimum() {

    }

    // Implement the method to retrieve a number at specific index
    public static void getElement() {

    }

    // Implement the method to replace a number at specific index
    public static void replaceElement() {

    }

    // Implement the method to sort the array in ascending order
    public static void sortArrayASC() {

    }
}
