package MultiThreading;

public class TestDamonThread extends Thread{
    public void run(){
        boolean flag = true;
        while(flag){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Damon running");
        }

    }
}
