package Algorithm;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class ChocolateGame {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        String result = s.substring(0,8);
        if(s.charAt(8) == 'P'){
            Integer hour = Integer.valueOf(s.split(":")[0]) + 12;
            //System.out.print(hour);
            if(hour != 24)
                return result.replaceFirst("^[0-9]{1,2}",hour.toString());
        }
        else{
            Integer hour = Integer.valueOf(s.split(":")[0]);
            if(hour == 12){
                return result.replaceFirst("^[0-9]{1,2}","00");
            }
        }
        return result;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
