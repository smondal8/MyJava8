package Sorting;

public class Selection implements Sorting{
    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 2, 3, 56};
        Selection selection = new Selection();
        Integer[] output = selection.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }

    public Integer[] sort(Integer[] list) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<list.length;i++){
            for(int j=0+i;j<list.length;j++){
                if(min > list[j]){
                    int temp = list[j];
                    list[j] = min;
                    min = temp;
                }
            }
            list[i] = min;
            min = Integer.MAX_VALUE;
        }
        return list;
    }
}
