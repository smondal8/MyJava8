public class twoDArray {
    //4*5
    int[][] tDArray = new int[4][5];
    void feedArray(int n,int m){
        for(int column=0;column<m;column++){
            for(int row=0;row<n;row++){
                tDArray[row][column] = 0;
            }
        }

    }
    void printArray(int n,int m){
        for(int column=0;column<m;column++){
            for(int row=0;row<n;row++){
                System.out.print(tDArray[row][column]);;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        twoDArray obj = new twoDArray();
        obj.feedArray(4,5);
        obj.printArray(4,5);
    }
}
