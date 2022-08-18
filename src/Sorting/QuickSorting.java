package Sorting;

import java.util.Arrays;

public class QuickSorting implements Sorting{
    @Override
    public Integer[] sort(Integer[] list) {
        return quickSort(list,0,list.length-1);
    }

    private Integer[] quickSort(Integer[] list, int first, int last) {
        if (first < last) {
            int partition = createPartition(list,first,last);
            list = quickSort(list,first,partition-1);
            list = quickSort(list,partition,last-1);
            //return list;
        }
        return list;
    }

    private int createPartition(Integer[] list, int first, int last) {
        int i=0;
        if (first < last) {
            i = first;
            --i;
            int pivot = list[last];
            for(int j = first;j<last-1;j++){
                if(pivot < list[j]){
                    //pivot = list[j];
                    i++;
                    list = swap(list,i,j);
                    //++i;
                }

            }
            list = swap(list,i+1,last);
            return i+1;
        }
        return i;
    }

    private Integer[] swap(Integer[] list, int i, int j) {
        int temp = list[i];
        list[i] = list[j];
        list[j] = temp;
        return list;
    }

    public static void main(String[] args) {
        Integer inputArray[] = {6,12,3,4,8,15,9,3,8,4};
        Sorting sorting = new QuickSorting();
        Arrays.stream(inputArray).forEach(s -> System.out.print(s+" ,"));
        System.out.println("--------");
        sorting.sort(inputArray);
        Arrays.stream(inputArray).forEach(s -> System.out.print(s+" ,"));
    }
}
