package lamdas;

import java.util.function.Function;
import java.util.function.Predicate;

public class LamdaDemo {

    public static int someMethod(String name) {
        System.out.println("say my name " + name);
        return 55;
    }

    public static void main(String[] args) {

//        before lambda
        empliSayable s1 = new empliSayable();
        s1.saySomething();

//        after lambda
        sayable s2 = () -> {
            System.out.println("Something");
        };

        s2.saySomething();

//        predefined sam's
        Predicate<Integer> t = tInt -> tInt > 13;

        System.out.println(t.test(15));

        Function<String, Integer> salution = (name) -> {
            System.out.println("how are you " + name);
            return 20;
        };
        int val = salution.apply("Vaibhav");
        System.out.println("value is " + val);

        Function<String, Integer> sal = LamdaDemo::someMethod;
        int val1 = sal.apply("Vaibhav");
    }
}
