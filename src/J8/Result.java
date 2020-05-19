package J8;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(Result::getApproximateMark).collect(Collectors.toList());
    }
    public static Integer getApproximateMark(Integer marks){
        if(marks>=38){
            if(marks % 5 == 3)
                marks = marks + 2;
            if(marks % 5 == 4)
                marks += 1;
        }
        return marks;

    }


}

