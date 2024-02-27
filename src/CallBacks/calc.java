package CallBacks;

public class calc {
    public int add(int a, int b){
        return a+b;
    }

    public int addKid(int a, int b) {
        broToCall br = new broToCall();
        try {
            Thread.sleep(5000);
            int ans =  add(a, b);
            br.callToTell(ans);
            return ans;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
