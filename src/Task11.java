//      Ввести c клавиатуры число в диапазоне от 0 до 1 000 000 включительно.
//        Озвучить его русскими словами.
//        Учесть, что для разных чисел могут быть различные окончание слов,
//        например «одна тысяча», «две тысячи», «пять тысяч».
//        Например, при вводе числа 1125,
//        программа должна вывести на консоль «одна тысяча сто двадцать пять».

import java.util.Arrays;
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число от 0 до 1000000: ");
        int a = in.nextInt();
        int cnt = 0;
        String str;

        //подсчёт количества символов
        while (a > 0) {
            int temp = a % 10;
            a /= 10;
            cnt++;      //cnt = количеству символов

        }
        System.out.println(cnt);

        for (int i = 0; i < cnt; i++) {
            int numeric = a % 10;
            a /= 10;
        }
    }
}
