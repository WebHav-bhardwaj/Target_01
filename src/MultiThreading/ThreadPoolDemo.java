package MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for(int i=1;i<=10;i++){
            Runnable coolie = new CoolieThread("-"+i);
            executorService.execute(coolie);
        }
        executorService.shutdown();

        while (!executorService.isTerminated()){}
        System.out.println("finished all threads");
    }
}