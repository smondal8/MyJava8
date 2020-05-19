package Sorting;

public class Quick implements Sorting {

    @Override
    public Integer[] sort(Integer[] list) {
        quicksort(list,0,list.length-1);
        return list;
    }

    /**
     * Real method
     * @param list
     * @param first
     * @param last
     */
    public void quicksort(Integer[] list ,int first ,int last){
        if(first < last){
            int partition = partition(list,first,last);
            quicksort(list,first ,partition-1);
            quicksort(list,partition+1,last);
        }
        //System.out.println("Quick sort is done");
    }

    private int partition(Integer[] list, int first, int last) {
        int i = first;
        int j = first;
        int pivot = list[last];
        --i;
        for(j=first;j<last;j++){
            if(list[j] <= pivot){
                i++;
                list = swap(list,i,j);
            }
        }
        swap(list,++i,last);
        return i;
    }

    private Integer[] swap(Integer[] list, Integer first, Integer second) {
        int tmp = list[first];
        list[first] = list[second];
        list[second] = tmp;
        return list;
    }

    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 2, 3, 56};
        Quick quick = new Quick();
        Integer[] output = quick.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
