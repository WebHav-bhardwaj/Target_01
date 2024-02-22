public class javaExceptionExample {
    public static void main(String[] args) {
        try{
            int a = 5/0;
        }catch(ArithmeticException e ){
            System.out.println("Cannot divide a number bu 0");
        }
    }
}
