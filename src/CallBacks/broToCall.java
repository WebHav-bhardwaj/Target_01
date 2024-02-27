package CallBacks;

public class broToCall {
    public void callToTell(int a){
        try{
            System.out.println("Brother is typing");
            Thread.sleep(2000);
            System.out.println("Kid's Brother called and provided with the answer "+a);
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
