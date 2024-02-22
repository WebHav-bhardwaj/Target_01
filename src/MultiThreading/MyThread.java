package MultiThreading;

public class MyThread extends Thread{
    int multiplicand;
    public MyThread(String dbThread, int i) {
        super(dbThread);
        multiplicand = i;
    }

    @Override
    public void run() {
        for(int i=1;i<5;i++){
            try {
                Thread.sleep(500);
                System.out.println(Thread.currentThread().getName()+"-"+i*multiplicand);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
