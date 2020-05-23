package Sorting;

public class Bubble implements Sorting{


    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 2, 3, 56};
        Bubble bubble = new Bubble();
        Integer[] output = bubble.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }

    public Integer[] sort(Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }
        return list;
    }
}