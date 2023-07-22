import java.util.Arrays;

public class Array {
    int size;


    int count;
    int[] arr;

    Array(final int size) {
        this.size = size;
        arr = new int[size];
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void init(int min, int max) {
        max -= min;
        for (int i = 0; i < this.arr.length; i++) {
            this.arr[i] = (int) ((Math.random() * max) + min);
        }
    }

    public String show() {
        String str = "";
        for (int i = 0; i < this.arr.length; i++) {
            str += arr[i] + " ";
        }
        return str;
    }

    public Array tsk5() {

        Array arrRes = new Array(this.size);
        Array temp = new Array(this.size);
        int cnt = 0;
        for (int i = 0; i < this.size; i++){
            if (this.arr[i] > 0){
                temp.arr[cnt++] = this.arr[i];
            }
            else if (this.arr[i] <= 0){
                if (cnt > temp.count){
                    Arrays.fill(arrRes.arr, 0);
                    for (int j = 0; j < this.size; j++){
                        arrRes.arr[j] = temp.arr[j];
                    }
                    temp.setCount(cnt);
                    this.setCount(cnt);
                }
                Arrays.fill(temp.arr, 0);
                cnt = 0;
            }
        }
        return arrRes;
    }
}
