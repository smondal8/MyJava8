package Dynamic;

import java.util.Arrays;

public class MInimumSum {
    public int minimumSum(int num) {
        String numString = num+"";
        char[] numArray = numString.toCharArray();
        Arrays.sort(numArray);
        return Integer.valueOf(numArray[0]+numArray[2]+numArray[1]+numArray[3]);
    }

    public static void main(String[] args) {
        System.out.println(new MInimumSum().minimumSum(4009));
    }
}
