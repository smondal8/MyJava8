package Algorithm;/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.*;
class FizzBuzzIssue {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
        */
        //Scanner
        Scanner s = new Scanner(System.in);
        int input = 0;
        Integer number = Integer.parseInt(s.nextLine());                 // Reading input from STDIN
            // Writing output to STDOUT
        for(int i=0;i<number;i++){
            printFizzBizz(s.nextInt());
        }

        // Write your code here

    }

    private static void printFizzBizz(int nextInt) {
        StringBuilder sb = new StringBuilder();
        if(nextInt % 3 == 0){
            sb.append("Fizz");
        }
        if(nextInt % 5 == 0){
            sb.append("Buzz");
        }
        System.out.println(sb.toString());
    }
}
