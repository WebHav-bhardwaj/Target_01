import java.io.IOException;

class TestException{
    void m() throws IOException {
        int c = 10 + 20;
        throw new java.io.IOException("device error");
    }

    void n() throws IOException {
        m();
    }

    void p(){
        try{
            n();
        }catch(IOException e){
            System.out.println("int p's catch block");
            System.out.println(e.getMessage());
        }
    }
}

public class TestExceptionPropogation {

    public static void main(String[] args) {
        TestException obj = new TestException();
        try{
            obj.p();
            throw new java.io.IOException("device error from main");
        }catch(IOException e){
            System.out.println("exception handled");
        }
    }
}
