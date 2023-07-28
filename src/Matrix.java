import java.util.Arrays;

public class Matrix {
    private int row;
    private int cols;
    private int[][] arr;

    public Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        this.arr = new int[this.row][this.cols];
    }

    public void init() {
        int cnt = 1;
        for (int i = 0; i < this.row; i++) {
            for (int j = 0; j < this.cols; j++) {
                this.arr[i][j] = cnt++;
            }
        }
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
        int max = this.arr[0][0];
        int min = this.arr[0][0];
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

    public void initSnake() {
        int cnt = 1;
        for (int i = 0; i < this.row; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < cols; j++) {
                    this.arr[i][j] = cnt++;
                }
            } else if (i % 2 != 0) {
                for (int j = this.cols - 1; j >= 0; j--) {
                    this.arr[i][j] = cnt++;
                }
            }
        }
    }

    public void initSnail() {
        int cnt = 1;
        int rowUp = 0;
        int rowDown = this.row - 1;
        int colsLeft = 0;
        int colsRight = this.cols - 1;

        while (cnt <= this.row * this.cols) {
            for (int i = rowUp; i <= colsRight; i++) {
                this.arr[rowUp][i] = cnt++;
            }
            rowUp++;
            for (int i = rowUp; i <= rowDown; i++) {
                this.arr[i][colsRight] = cnt++;
            }
            colsRight--;
            for (int i = colsRight; i >= colsLeft; i--) {
                this.arr[rowDown][i] = cnt++;
            }
            rowDown--;
            for (int i = rowDown; i >= rowUp; i--) {
                this.arr[i][colsLeft] = cnt++;
            }
            colsLeft++;
        }
    }

    public void initDiagonal() {
        int cnt = 1;
        int digitOfDiagonal = this.row - 1;
        int index = 0;

        while (cnt <= this.row * this.cols) {
            for (int i = 0; i < this.row; i++) {
                for (int j = 0; j < this.cols; j++) {
                    if (i + j == this.cols - 1 - digitOfDiagonal) {
                        this.arr[i][j] = cnt++;
                    }
                }
            }
            digitOfDiagonal--;
            index++;
        }
    }

    public void initRandOfKino() {
        for (int i = 0; i < this.row; i++){
            for (int j = 0; j < this.cols; j++){
                arr[i][j] = (int) (Math.random() + 0.5);
            }
        }
    }

    public String freePlaces(int value) {
        int cnt = 0;
        String strRes = new String();
        String strTemp = new String();

        for (int i = 0; i < this.row; i++) {
            cnt = 0;
            strRes += "ряд: " + i;
            strTemp ="\tместа: ";
            for (int j = 0; j < this.cols; j++){
                if (this.arr[i][j] == 0){
                    strTemp += j + ", ";
                    cnt++;
                } else {
                    if (cnt >= value) {
                        strRes += strTemp + "\t";
                    }
                    strTemp ="\tместа: ";
                    cnt = 0;
                }
            }
            strRes += "\n";
        }
        return strRes;
    }
}
