package ie.atu;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        add();
    }

    public static void add()
    {
        System.out.println("Please enter your first number: ");
        Scanner inputs = new Scanner(System.in);
        int firstNumber = inputs.nextInt();

        System.out.println("Please enter your second number: ");
        Scanner inputs = new Scanner(System.in);
        int secondNumber = inputs.nextInt();

        System.out.println("The total is " + total);
    }

    public static void delete()
    {

    }
}
