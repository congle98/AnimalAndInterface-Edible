package Animal;
import Edible.*;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "chicken";
    }

    @Override
    public String howtoEat() {
        return "could be fried";
    }
}
