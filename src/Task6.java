//        Создать квадратный массив размерности n заполненный случайными числами,
//        вывести массив на экран в виде та- блицы, найти наименьший и
//        наибольший элемент массива и вывести их на экран
//        (если найдено несколько одинаковых элементов – вывести индексы строка и столбца,
//        где есть повторения). Вывести на экран время выполнения поиска, в миллисекундах.
//        Размерность массива должна задаваться с клавиатуры.

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер матрицы");
        int a = in.nextInt();
        Matrix mtrx = new Matrix(a, a);
        mtrx.initRand(30);
        System.out.println(mtrx.show());
        System.out.println(mtrx.tsk6());

        //допилить!!!
    }
}
