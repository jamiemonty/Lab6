package ie.atu;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[10];

        numbers[0] = 100;
        numbers[1] = 200;
        numbers[2] = 300;
        numbers[3] = 400;
        numbers[4] = 500;
        numbers[5] = 600;
        numbers[6] = 700;
        numbers[7] = 800;
        numbers[8] = 900;
        numbers[9] = 1000;

        for (int i = 0; i < numbers.length; i++){
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

    }

}

