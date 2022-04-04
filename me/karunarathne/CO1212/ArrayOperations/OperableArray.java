package me.karunarathne.CO1212.ArrayOperations;

public class OperableArray implements Operations {
    private int [] baseArray ;
    private int size;

    private int pointer ;

    public OperableArray (String inputString) {
        String [] arr = inputString.split(" ");
        size = arr.length ;
        baseArray = new int [size] ;
        for (int i = 0; i< size; i++) {
            baseArray [i] = Integer.parseInt(arr [i]) ;
        }
    }

    public OperableArray (int size) {
        this.size = size ;
        baseArray = new int [size] ;
        pointer = 0 ;
    }

    public void addElement (int element) {
        if (element>size) throw new IndexOutOfBoundsException("out of array bounds") ;
        baseArray [pointer] = element ;
    }

    // Implement the method to display the numbers of the array
    public void printArray() {
        for (int i = 0; i< size; i++) {
            System.out.print (baseArray [i] + " ");
        }
        System.out.println () ;
    }

    // Implement the method to display the numbers reversely
    public void printReverse() {
        for (int i = size -1; i>=0; i--) {
            System.out.print (baseArray [i] + " ");
        }
        System.out.println () ;
    }

    /**
     * Search if a specified integer exists within an array.
     * If found, this method returns the index where the element was found first.
     * If the element was not found, returns -1
     * @param number        integer to search (search key)
     * @return              the index of that element
     */
    public int Search(int number) {
        for (int i = 0; i< size; i++) {
            if (baseArray [i] == number) return i;
        }
        return -1 ;
    }

    /**
     * Retrieves the largest integer within the array
     * @return      max
     */
    public int Maximum() {
        int max = baseArray [0] ;
        for (int i = 0; i< size; i++) {
            if (baseArray [i] > max) max = baseArray [i] ;
        }
        return max ;
    }

    /**
     * Retrieves the smallest integer within the array
     * @return      min
     */
    public int Minimum() {
        int min = baseArray [0] ;
        for (int i = 0; i< size; i++) {
            if (baseArray [i] < min) min = baseArray [i] ;
        }
        return min ;
    }

    /**
     * Retrieves the element at a specific index
     * @param index     index to retrieve the element
     * @return          the element at the specified index
     */
    public int getElement(int index) {
       return baseArray [index] ;
    }

    /**
     * Used to replace an element in a given index to a specified integer
     * @param index         index to replace the element from
     * @param replaceWith   replace the element with this
     */
    public void replaceElement(int index, int replaceWith) {
        baseArray [index] = replaceWith ;
    }

    /**
     * Sorts the array in the ascending order
     */
    public void sortArrayASC() {
        for (int i=0; i<baseArray.length; i++) {
            int currentMinIndex = i ;
            for (int j=i+1; j<baseArray.length; j++) {
                if (baseArray [j] < baseArray [currentMinIndex]) {
                    currentMinIndex = j ;
                }
            }

            int temp = baseArray [i] ;
            baseArray [i] = baseArray [currentMinIndex] ;
            baseArray [currentMinIndex] = temp ;
        }
    }
}
