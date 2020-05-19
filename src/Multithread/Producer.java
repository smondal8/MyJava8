package Multithread;

import java.util.concurrent.atomic.AtomicInteger;
//concurrent hashmap will be easier
public class Producer {
    public static volatile AtomicInteger centralCharecter = new AtomicInteger(0);
    public static void main(String[] args) {
        Thread prod = new Thread(()->{
            try {
                while (true) {
                    if (centralCharecter.get() < 20) {
                        increaseValue();
                        System.out.println("Increased centralCharecter value, new value" + centralCharecter);
                        Thread.sleep(100);
                    }
                }
            }
            catch (InterruptedException e){
                //
            }
        });
        Thread cons = new Thread(()->{
            try {
                while (true) {
                    if (centralCharecter.get() > 10) {
                        decreaseValue();
                        System.out.println("Decreased centralCharecter value, new value" + centralCharecter);
                        Thread.sleep(100);
                    }
                }
            }
            catch(InterruptedException e){

            }
        });
        System.out.println("Starting producer..");
        prod.start();
        System.out.println("Starting consumer..");
        cons.start();
    }
    public static void decreaseValue(){
        //centralCharecter--;
        centralCharecter.getAndDecrement();

    }
    public static void increaseValue(){
       // centralCharecter++;
        centralCharecter.getAndIncrement();
    }
}
