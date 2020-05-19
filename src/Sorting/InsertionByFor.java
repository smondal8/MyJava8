package Sorting;

public class InsertionByFor implements Sorting {
    @Override
    public Integer[] sort(Integer[] list) {
        int i = 0;
        int j = 0;
        for(i=0;i<list.length;i++){
            int key = list[i];
            for(j = i -1  ; j >= 0 && list[j]>key;j--){
                list[j+1] = list[j];
            }
            list[j+1] = key;
        }
        return  list;
    }
    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 2, 3, 56};
        InsertionByFor insertByFor = new InsertionByFor();
        Integer[] output = insertByFor.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
