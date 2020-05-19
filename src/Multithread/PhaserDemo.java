package Multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PhaserDemo {
    public static void main (String[] args){
        ExecutorService exec = Executors.newSingleThreadExecutor();
        exec.execute(()->{

        });
    }
}
