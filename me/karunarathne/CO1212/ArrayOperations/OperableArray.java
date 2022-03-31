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
            System.out.print (baseArray [i] + " ");
        }
        System.out.println () ;
    }

    // Implement the method to display the numbers reversely
    public void printReverse() {
        for (int i=length-1; i>=0; i--) {
            System.out.print (baseArray [i] + " ");
        }
        System.out.println () ;
    }

    // Implement the method to search a specific number from the array
    public int Search(int number) {
        for (int i=0; i<length; i++) {
            if (baseArray [i] == number) return i;
        }
        return -1 ;
    }

    // Implement the method to find the maximum number from the array
    public int Maximum() {
        int max = baseArray [0] ;
        for (int i=0; i<length; i++) {
            if (baseArray [i] > max) max = baseArray [i] ;
        }
        return max ;
    }

    // Implement the method to find the minimum number from the array
    public int Minimum() {
        int min = baseArray [0] ;
        for (int i=0; i<length; i++) {
            if (baseArray [i] < min) min = baseArray [i] ;
        }
        return min ;
    }

    // Implement the method to retrieve a number at specific index
    public int getElement(int index) {
       return baseArray [index] ;
    }

    // Implement the method to replace a number at specific index
    public void replaceElement(int index, int replaceWith) {
        baseArray [index] = replaceWith ;
    }

    // Implement the method to sort the array in ascending order
    public void sortArrayASC() {
        int [] sortedArray = new int [length] ;
        for (int i=0; i<length; i++) {
            int currentMin = baseArray [i] ;
            for (int j=i+1; j<length; j++) {
                if (baseArray [j] < currentMin) {
                    currentMin = baseArray [j] ;
                }
            }
            sortedArray [i] = currentMin ;
        }
        baseArray = sortedArray ;
    }
}
