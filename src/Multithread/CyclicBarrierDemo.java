package Multithread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierDemo {
    public static void main(String[] args){
        CyclicBarrier localcyclicBarrier = new CyclicBarrier(3);
        WorkingClass worker1  = new WorkingClass(localcyclicBarrier);
        WorkingClass worker2 = new WorkingClass(localcyclicBarrier);
        WorkingClass worker3 = new WorkingClass(localcyclicBarrier);

        worker1.start();
        worker2.start();
        worker3.start();

        System.out.println("Main thread completed!!");


    }
}

class WorkingClass extends Thread {
    public CyclicBarrier CB;

    public WorkingClass(CyclicBarrier CB) {
        this.CB = CB;
    }

    @Override
    public void run(){
        try{
            System.out.println("Thread started "+ Thread.currentThread().getName());
            //Thread.currentThread().get
            Thread.sleep(10);
            try {
                CB.await();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
            System.out.println("Thread finished "+ Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
