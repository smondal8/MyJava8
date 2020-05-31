package Algorithm;

import java.util.*;
import java.util.stream.Collectors;

//https://www.interviewbit.com/problems/subset/
public class SubsetProblem {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
        if(A==null)
            return null;
        int n = A.size();
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        result.add(new ArrayList<Integer>());
        for(int i=0;i<A.size();i++)
            subsets(A, result, new ArrayList(),i);
        return result;
    }
    public static void subsets(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp, int i){
        temp.add(A.get(i));
        result.add(temp);
        if(i==A.size())
            return;
        for(int j=i+1;j<A.size();j++){
            subsets(A, result, new ArrayList<Integer>(temp), j);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        result.add(1);
        result.add(2);
        result.add(3);
        ArrayList<ArrayList<Integer>> output = subsets(result);
        System.out.println("Output:");
        for(ArrayList<Integer> arg : output){
            for(int entry : arg){
                System.out.print(entry);
            }
            System.out.println();
        }

    }
}
