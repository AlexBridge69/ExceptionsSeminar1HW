import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив,
// каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
// Если длины массивов не равны, необходимо как-то оповестить пользователя.
// Важно: При выполнении метода единственное исключение, которое пользователь может увидеть -
// RuntimeException, т.е. ваше.
public class Task3 {
    public static void main(String[] args) {
        int[] array1 = {1, 9, 2, 8};
        int[] array2 = {9, 1, 8};
        double[] ArrayRes = new double[array1.length];
        ArrayRes = DivideOf2Arrays(array1, array2);
        System.out.println(Arrays.toString(ArrayRes));
    }

    public static double[] DivideOf2Arrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("The operation is not possible because the arrays are of different lengths.");
        }
        double ArrayResult[] = new double[array1.length];
        for (int i = 0; i < array1.length; i++) {
            ArrayResult[i] = array2[i] / array1[i];
        }
        return ArrayResult;
    }
}
