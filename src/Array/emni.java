package Array;

import java.lang.reflect.Array;
import java.util.*;

public class emni {
        public int[][] prettyPrint(int A) {
            int[][] result = new int[A*2-1][A*2-1];
            int t = 0;
            int b = result.length;
            int l = 0;
            int r = result.length;
            int layer = A;
            while(t<b && l<r){
                for(int i=l;i<r;i++){
                    result[t][i] = layer;
                }
                t++;
                for(int i=t;i<b;i++){
                    result[i][r-1] = layer;
                }
                r--;
                for(int i=r-1;i>=l;i--){
                    result[b-1][i] = layer;
                }
                b--;
                for(int i=b-1;i>=t;i--){
                    result[i][l] = layer;
                }
                l++;
                layer--;
            }

            return result;
        }

        public static void main(String[] args) {
            emni sol = new emni();
            int[][] soln = new int[4][4];
            soln = sol.prettyPrint(4);
            for(int i=0;i<4;i++){
                for(int j=0;j<4;j++){
                    System.out.print(soln[i][j]);
                }
                System.out.println();
            }
        }
    }
