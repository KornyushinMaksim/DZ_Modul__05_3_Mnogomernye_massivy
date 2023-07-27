//      Даны числа n и m.
//        Создайте массив размерностью [n][m] и заполните его числами по диагонали.
//        Выведите результат на экран с соблюдением ширины столбцов.

public class Task9 {
    public static void main(String[] args) {
        Matrix mtrx = new Matrix(5,5);
        mtrx.initDiagonal();
        System.out.println(mtrx.show());
    }
}
