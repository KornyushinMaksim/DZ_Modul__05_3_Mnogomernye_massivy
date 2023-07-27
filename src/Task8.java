//      Заполните n-мерный квадратный массив числами,
//        которые увеличиваются на 1 по спирали
//        (число n должно задаваться с клавиатуры).
//        Выведите результат на экран с соблюдением ширины столбцов.

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер матрицы: ");
        int a = in.nextInt();
        Matrix mtrx = new Matrix(a,a);
        mtrx.initSnail();
        System.out.println(mtrx.show());

    }
}
