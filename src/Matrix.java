public class Matrix {
    int row;
    int cols;
    int[][] arr;

    public Matrix(int row, int cols) {
        this.row = row;
        this.cols = cols;
        this.arr = new int[this.row][this.cols];
    }

    public void init (){
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                this.arr[i][j] = (int) (Math.random() * 200);
            }
        }
    }

    public String show (){
        String str = "";
        for (int i = 0; i <this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                if (this.arr[i][j] < 10) str += (this.arr[i][j] + "      ");
                else if (this.arr[i][j] < 100) str += (this.arr[i][j] + "     ");
                else if (this.arr[i][j] < 1000) str += (this.arr[i][j] + "    ");
                else if (this.arr[i][j] < 10000) str += (this.arr[i][j] + "   ");
                else if (this.arr[i][j] < 100000) str += (this.arr[i][j] + "  ");
                else str += (this.arr[i][j] + "  ");
            }
            str += "\n";
        }
        return str;
    }

    public void squareIndex(){
        int count = 1;
        for (int i = 0; i < this.arr.length; i++){
            for (int j = 0; j < this.arr[i].length; j++){
                this.arr[i][j] = (int) (Math.pow(count++, 2));
            }
        }
    }
}
