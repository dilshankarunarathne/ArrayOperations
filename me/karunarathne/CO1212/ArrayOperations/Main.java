package me.karunarathne.CO1212.ArrayOperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in) ;
        Operations array = new OperableArray (scanner.nextLine()) ;
    }

    private static void print (String output) {
        System.out.print(output);
    }
}
