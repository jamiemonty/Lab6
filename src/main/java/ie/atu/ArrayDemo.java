package ie.atu;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        int[] anArray;

        anArray = new int[10];

        anArray[0] = 100;
        anArray[1] = 200;
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;


        for (int i = 0; i < anArray.length; i++){
            System.out.println("Element at index " + i + ": " + anArray[i]);
        }

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a value for the 10th array: ");
            anArray[10] = scanner.nextInt();
        }
        catch(Exception e) {

            System.out.println("anArray[10] is defined.");

        }

    }

}

