//        Создать массив из 20 случайных чисел в диапазоне от -10 до 20.
//        Определить максимальное количество подряд идущих положительных элементов,
//        не прерываемых ни нулями, ни отрицательными числами.
//        Вывести на консоль исходный массив и найденный фрагмент.


public class Task5 {
    public static void main(String[] args) {
        final int size = 20;
        Array array = new Array(size);

        array.init(-10, 20);
        System.out.println(array.show());
        Array arr = array.tsk5();
        Array arrRes = new Array(array.getCount());
        System.arraycopy(arr.arr, 0, arrRes.arr, 0, array.getCount());
        System.out.println(arrRes.show());
    }
}
