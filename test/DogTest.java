import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import task_2.Dog;

import java.text.DecimalFormat;

public class DogTest {
    @Test
    void isDogMakeSound(){
        Dog dog = new Dog();

        Assertions.assertEquals("Bau Bau!", dog.makeSound(), "Incorrect answer!");
    }

    @Test
    void isDogEatCorrect(){
        Dog dog = new Dog();
        dog.eat("dog food");
        double result = dog.getWeight();
        Assertions.assertEquals(10.05, result, "Incorrect answer!");
    }
    @Test
    void isDogEatIncorrect(){
        Dog dog = new Dog();
        dog.eat("dog food");
        double result = dog.getWeight();
        Assertions.assertNotEquals(10.5, result, "Incorrect answer!");
    }
    @Test
    void isDogWalkOutCorrect(){
        Dog dog = new Dog();
        dog.eat("dog food");
        dog.walkOut(60);
        double result = dog.getWeight();

        DecimalFormat df = new DecimalFormat("#.##");

        Assertions.assertEquals(df.format(10.01), df.format(result), "Incorrect answer!");

    }

    @Test
    void isDogWalkOutIncorrect(){
        Dog dog = new Dog();
        dog.eat("dog food");
        dog.walkOut(60);
        double result = dog.getWeight();

        DecimalFormat df = new DecimalFormat("#.##");

        Assertions.assertNotEquals(df.format(10.02), df.format(result), "Incorrect answer!");

    }
}
