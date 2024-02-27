package CallBacks;

public class CallBackDemo {
    public static void main(String[] args) {
        calc cal = new calc();
        System.out.println(cal.add(2,2));
        new Thread(){
            public void run(){
                cal.addKid(4,8);
            }
        }.start();
        System.out.println("do something else");
    }
}
