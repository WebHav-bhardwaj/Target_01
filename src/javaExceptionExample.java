public class javaExceptionExample {
    public static void main(String[] args) {
        try{
            int b = 5;
            int c = 0;
            int a = b/c;
            System.out.println(a);

        }catch(ArithmeticException e ){
            System.out.println("Cannot divide a number bu 0");
        }
    }
}
