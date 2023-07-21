import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        final int size = 5;
        int[] arr = new int[size];
        //arr[0] = 1;
        for (int i = 0; i < size; i++){
            //for (int j = 0; j < 5; j++){
                arr[i - 1] += 1;
            //}
        }
        System.out.println(Arrays.toString(arr));
    }
}
