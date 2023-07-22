//        Создать массив из 100 случайных чисел в диапазоне от - 300 до 555.
//        Написать программу, копирующую один массив в другой следующим образом:
//        сначала копируются последовательно все элементы, большие 0,
//        затем последовательно все элементы, равные 0, а затем последовательно все элементы, меньшие 0.
//        Вывести исходный массив. Вывести результирующий массив.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        final int size = 100;
        int[] arr =new int[size];
        int[] arrRes = new int[size];
        int negative = 0;
        int zero = 0;
        int positive = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) (Math.random() * 855) - 300;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 0) negative++;
            else if (arr[i] == 0) zero++;
            else if (arr[i] > 0) positive++;
        }
        Arrays.sort(arr);
        System.arraycopy(arr, 0, arrRes, 0, negative);
        System.arraycopy(arr, negative, arrRes, negative, zero);
        System.arraycopy(arr, negative + zero, arrRes, negative + zero, positive);
        System.out.println(Arrays.toString(arrRes));

    }
}
