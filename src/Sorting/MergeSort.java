package Sorting;

public class MergeSort implements Sorting{
    @Override
    public Integer[] sort(Integer[] list) {
        Sort(list,0,list.length-1);
        return list;
    }

    private void Sort(Integer[] list, int l, int h) {
        if(l<h) {
            int mid = (h + l) / 2;
            Sort(list, l, mid);
            Sort(list, mid + 1, h);
            Merge(list, l, mid, h);
        }
    }

    private void Merge(Integer[] list, int l, int mid, int h) {
        int leftSize = mid - l + 1;
        int rightSize = h - mid;
        int rightPointer = 0;
        int leftPointer = 0;
        int index = l;
        Integer[] left = new Integer[leftSize];
        Integer[] right = new Integer[rightSize];
        for(int i = 0;i<leftSize;i++){
            left[i] = list[l+i];
        }
        for(int j=0;j<rightSize;j++){
            right[j] = list[mid+1+j];
        }
        while(leftPointer < leftSize && rightPointer < rightSize){
            if(left[leftPointer]<right[rightPointer]) {
                list[index] = left[leftPointer];
                leftPointer++;
            }
            else{
                list[index] = right[rightPointer];
                rightPointer++;
            }
            index++;
        }
        while(leftPointer < leftSize){
            list[index] = left[leftPointer];
            leftPointer++;
            index++;
        }
        while(rightPointer < rightSize){
            list[index] = right[rightPointer];
            rightPointer++;
            index++;
        }
    }
    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 2, 3, 56};
        MergeSort merge = new MergeSort();
        Integer[] output = merge.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
