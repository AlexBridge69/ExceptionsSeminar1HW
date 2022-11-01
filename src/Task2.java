import java.util.Arrays;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен разности элементов
//двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
public class Task2 {
    public void main(String[] args) {
        int[] array1 = {1, 6, 4, 8};
        int[] array2 = {9, 7, 3};
        int[] arrayRes = new int[array1.length];
        arrayRes = SubtractionOfArrays(array1, array2);
        System.out.println(Arrays.toString(arrayRes));
    }

    public int[] SubtractionOfArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            throw new RuntimeException("The operation is not possible because the arrays are of different lengths.");
        int[] arrayResult = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            arrayResult[i] = array1[i] - array2[i];
        }
        return arrayResult;
    }
}