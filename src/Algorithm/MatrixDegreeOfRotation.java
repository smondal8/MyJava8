package Algorithm;

public class MatrixDegreeOfRotation {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[4][4];
        int seq = 0;
        for(int j = 0;j<4;j++){
            for(int i = 0;i<4;i++){
                matrix[j][i] = seq++;
            }
        }
        print(matrix);
        matrix = rotateLeft(matrix,4,4,3);
        System.out.println("After left rotation.");
        print(matrix);
    }

    private static Integer[][] rotateLeft(Integer[][] matrix, int row, int col, int degree) {
            int R = 0;
            int C = 0;
            int prev = 0;
            while (R < row && C < col) {
                prev = matrix[R][C + 1];
                //Left Column
                for (int i = R; i < row - 1; i++) {
                    int tmp = matrix[i][C];
                    matrix[i][C] = prev;
                    prev = tmp;
                }
                //Last Row
                for (int i = C; i < col - 1; i++) {
                    int tmp = matrix[row - 1][i];
                    matrix[row - 1][i] = prev;
                    prev = tmp;
                }
                //Last Column
                for (int i = row - 1; i > R; i--) {
                    int tmp = matrix[i][col - 1];
                    matrix[i][col - 1] = prev;
                    prev = tmp;
                }
                //First Row
                for (int i = col - 1; i > C; i--) {
                    int tmp = matrix[R][i];
                    matrix[R][i] = prev;
                    prev = tmp;
                }
                R++;
                C++;
                row--;
                col--;
            }

        return matrix;
    }

    private static void print(Integer[][] matrix) {
        System.out.println("##############");
        for(int j = 0;j<4;j++){
            for(int i = 0;i<4;i++){
                System.out.print(matrix[j][i]+"     ");
            }
            System.out.println();
        }
    }
}
