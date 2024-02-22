package MultiThreading;

public class TestMultiThreading {
    public static void main(String[] args) {
        ThreadJoin th1 = new ThreadJoin();
        ThreadJoin th2 = new ThreadJoin();
        ThreadJoin th3 = new ThreadJoin();

        th1.start();

        try {
            th1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th2.start();

        try {
            th2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        th3.start();


//        RThread rThread = new RThread();
//        Thread t1  = new Thread(rThread);
//        t1.start();
//
//        TestDamonThread tdt = new TestDamonThread();
//        tdt.setDaemon(true);
//        tdt.start();
//
//
//        MyThread dbT = new MyThread("dbThread",10);
//        dbT.start();
//
//
//        MyThread netT = new MyThread("netThread", 100);
//        netT.start();
//
//        for(int i=1;i<5;i++){
//            try {
//                Thread.sleep(750);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println(Thread.currentThread().getName()+"-"+i*1000);
//        }

    }
}
