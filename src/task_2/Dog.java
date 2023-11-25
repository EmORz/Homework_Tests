package task_2;

import java.text.Format;

//2. Да се направи клас Dog с полета: порода, име,
//        възраст, тегло. И методи: makeSound() - който отпечатва
//        “Bau Bau!”, eat(String food), който увеличава теглото на
//        кучето с 50гр, и walkOut(int time), при който теглото на
//        кучето намаля с 40гр.
//        Добавете поне по 2 тестови сценария към методите
//        eat(), walkOut() и тествайте метода makeSound().
public class Dog {
    private String breed;
    private String name;
    private int age;
    private double weight;

    public Dog() {
        this.weight = 10;
    }

    public String makeSound(){
        return "Bau Bau!";
    }

    public void eat(String food){
        this.weight+=0.05;
    }
    public void walkOut(int time){
        this.weight-=0.04;
    }

    public double getWeight() {
        return weight;
    }
}
