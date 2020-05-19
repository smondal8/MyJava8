package Algorithm;

public class MatrixNinetyDegreeRotation {

    public static void main(String[] args) {
        Integer[][] matrix = new Integer[4][4];
        int seq = 0;
        for(int j = 0;j<4;j++){
            for(int i = 0;i<4;i++){
                matrix[j][i] = seq++;
            }
        }
        print(matrix);
        System.out.println("Rotated left...");
        matrix = rotateLeft(matrix,4,4);
        print(matrix);
        System.out.println("Rotated right ...");
        matrix = rotateRight(matrix,4,4);
        print(matrix);
    }

    private static Integer[][] rotateLeft(Integer[][] matrix, int row, int col) {
        matrix  = transpose(matrix,row,col);
        matrix = reverseRow(matrix,row,col);
        //print(matrix);
        return matrix;
    }
    private static Integer[][] rotateRight(Integer[][] matrix, int row, int col) {
        matrix  = transpose(matrix,row,col);
        //print(matrix);
        matrix = reversseColumn(matrix,row,col);
        //print(matrix);
        return matrix;
    }

    private static Integer[][] reverseRow(Integer[][] matrix, int row, int col) {
        for(int i = 0;i<col;i++){
            for(int j=0,k=row-1;j<k;j++,k--){
                int tmp = matrix[j][i];
                matrix[j][i] = matrix[k][i];
                matrix[k][i] = tmp;
            }
        }
        return matrix;
    }

    private static Integer[][] reversseColumn(Integer[][] matrix, int row, int col) {
        for(int i=0;i<row;i++){
            for(int j=0,k=col-1;j<k;j++,k--){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[i][k];
                matrix[i][k] = tmp;
            }
        }
        return matrix;
    }

    private static Integer[][] transpose(Integer[][] matrix, int row, int col) {
        for(int i=0;i<row;i++){
            for(int j=i;j<col;j++){
                int tmp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = tmp;
            }
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
