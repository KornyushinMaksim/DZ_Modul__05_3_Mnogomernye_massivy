//        Создать массив из 20 случайных чисел в диапазоне от -10 до 30.
//        Написать программу, определяющую сумму элементов массива,
//        находящихся в массиве после первого отрицательного элемента
//        (первый отрицательный элемент не должен входить в сумму).
//        Вывести на консоль полученный массив и сумму.

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = new int[20];
        int countIndex = 0;
        int res = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) ((Math.random() * 40) - 10);
        }
        System.out.println(Arrays.toString(arr) + "\n");

        for (int i = 0; i < arr.length; i++){
            if (arr[i] >= 0) countIndex++;
            else break;
        }

        for (int i = countIndex + 1; i < arr.length; i++){
            res += arr[i];
        }

        System.out.printf("Сумму элементов массива, " +
                "находящихся в массиве после первого отрицательного элемента: %d", res);
    }
}
