package Sorting;

public class HeapSort implements Sorting {
    @Override
    public Integer[] sort(Integer[] list) {
        int n = list.length;
        for(int i=n/2-1;i>=0;i--){
            heapify(list,n,i);
        }
        for(int i=n-1;i>=0;i--) {
            swap(0, i,list );
            heapify(list,i,0);
        }
        return list;
    }

    private void swap(Integer integer, Integer integer1, Integer[] list) {
        int tmp = list[integer];
        list[integer] = list[integer1];
        list[integer1] = tmp;
    }

    private void heapify(Integer[] list, int n, int i) {
        int largest = i;
        int left = i*2 +1;
        int right = i*2+2;
        if(left<n && list[left]>list[largest]){
            largest = left;
        }
        if(right<n && list[right]>list[largest]){
            largest = right;
        }
        if(largest != i){
            swap(i,largest,list );
            heapify(list,n,largest);
        }
    }

    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 8, 2, 3, 56};
        HeapSort heap = new HeapSort();
        Integer[] output = heap.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
