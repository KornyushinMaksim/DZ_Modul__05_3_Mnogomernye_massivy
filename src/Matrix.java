public class Matrix {
    private int row;
    private int cols;
    private int[][] arr;

    public Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        this.arr = new int[this.row][this.cols];
    }

    public void initRand(int value) {
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = (int) (Math.random() * value);
            }
        }
    }

    public String show() {
        String str = "";
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                if (this.arr[i][j] < 10) str += (this.arr[i][j] + "       ");
                else if (this.arr[i][j] < 100) str += (this.arr[i][j] + "      ");
                else if (this.arr[i][j] < 1000) str += (this.arr[i][j] + "     ");
                else if (this.arr[i][j] < 10000) str += (this.arr[i][j] + "    ");
                else if (this.arr[i][j] < 100000) str += (this.arr[i][j] + "   ");
                else if (this.arr[i][j] < 1000000) str += (this.arr[i][j] + "  ");
                else str += (this.arr[i][j] + "  ");
            }
            str += "\n";
        }
        return str;
    }

    public void squareIndex() {
        int count = 1;
        for (int i = 0; i < this.arr.length; i++) {
            for (int j = 0; j < this.arr[i].length; j++) {
                this.arr[i][j] = (int) (Math.pow(count++, 2));
            }
        }
    }

    public String tsk6() {
        int max = 0;
        int ave = 0;
        int min = 0;
        String strMax = new String("max:\n");
        String strMin = new String("min:\n");

        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.cols; j++) {
                if (this.arr[i][j] > max) {
                    max = this.arr[i][j];
                }
                if (this.arr[i][j] < min) {
                    min = this.arr[i][j];
                }
            }
        }
        for (int a = 0; a < this.row; a++) {
            for (int b = 0; b < this.cols; b++) {
                if (max == this.arr[a][b]) {
                    strMax += a + ";" + b + " - " + this.arr[a][b] + "\n";
                }
                if (min == this.arr[a][b]) {
                    strMin += a + ";" + b + " - " + this.arr[a][b] + "\n";
                }
            }
        }
        return strMax + strMin;
    }
}
