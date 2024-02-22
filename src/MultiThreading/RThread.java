package MultiThreading;

public class RThread implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep(750);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("runnable is running");
    }
}
