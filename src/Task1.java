//        Сформировать  массив, элементами которого
//        будут квадраты соответствующих индексов.
//        Вывести результат на экран.

public class Task1 {
    public static void main (String[] args){
        Matrix arr = new Matrix(10,10);
        //arr.init();
        arr.squareIndex();
        System.out.println(arr.show());
    }
}
