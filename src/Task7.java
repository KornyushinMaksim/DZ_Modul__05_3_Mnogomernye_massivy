//        Заполните n-мерный квадратный массив возрастающими числами – змейкой.
//        Выведите результат на экран с соблюдением ширины столбцов

public class Task7 {
    public static void main(String[] args) {

        Matrix mtrx = new Matrix(7, 5);
        mtrx.initSnake();
        System.out.println(mtrx.show());
    }
}
