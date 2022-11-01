// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения.

import java.io.Reader;
import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
    }

    public static void AddingOfElementToArray(int[] array, int index, int element) {
        if (index > array.length) {
            throw new RuntimeException("There is no index in the array.");
        }
        array[index] = element;
    }

    public static void FindingOfElementInArray(int[] array, int element) {
        int result = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) result = i;
        }
        if (result == -1) throw new RuntimeException("There is no element in the array.");
        else {
            System.out.println("Element founded in array.");
        }
    }

    public static void UserAge() {
        System.out.println("Please enter your full age.");
        Scanner scanner = new Scanner(System.in);
        int userAge = scanner.nextInt();

        if (userAge != 28) throw new RuntimeException("Invalid age entered.");
    }
}
