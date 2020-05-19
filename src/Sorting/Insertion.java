package Sorting;

public class Insertion implements Sorting {
    @Override
    public Integer[] sort(Integer[] list) {
        int interim,key = 0;
        for(int i=1;i<list.length;i++){
           interim = i-1;
           key = i;
           while(list[key]<list[interim] && key >= 0){
               int tmp = list[key];
               list[key] = list[interim];
               list[interim] = tmp;
               if(interim != 0) {
                   key--;
                   interim--;
               }
           }
        }
        return list;
    }

    public static void main(String[] args) {
        Integer[] list = {15, 7, 8, 2, 3, 56};
        Insertion insertion = new Insertion();
        Integer[] output = insertion.sort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.println(list[i]);
        }
    }
}
