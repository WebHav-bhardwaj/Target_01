//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Dog d = new Dog();
        Animal a = new Animal();
        // scope of functions and variables are defined by animal in the below case and which function is going to run is determined by dog()
        Animal d2 = new Dog();
        Labra l1 = new Labra();
        l1.beAnimal();
    }
}