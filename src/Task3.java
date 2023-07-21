//        Создать массив из 200 случайных чисел в диапазоне от 0 до 200.
//        Определить количество одноразрядных, двухразрядных и
//        трёхразрядных чисел в процентном отношении.
//        Вывести на консоль полученный массив и количество по разрядам.
//        Пример:
//        digit 1 = 4
//        digit 2 = 45
//        digit 3 = 39

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        final int size = 200;
        int[] arr = new int[size];
        int singleDigit = 0;
        int twoDigit = 0;
        int treeDigit = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = (int) ((Math.random() * 200) + 1);
            i++;
        }
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < 10) singleDigit++;
            else if (arr[i] < 100) twoDigit++;
            else if (arr[i] < 1000) treeDigit++;
        }

        System.out.printf("\nодноразрядные: %d%%\nдвухрязрядные: %d%%\nтрехразрядные: %d%%",
                singleDigit / (size / 100), twoDigit / (size / 100), treeDigit / (size / 100));
    }
}
