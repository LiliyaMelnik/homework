package animals;

public class Dog extends Animal implements Runable {
    @Override
    void sleep() {
        System.out.println("animals.Dog sleeps!");
    }

    @Override
    void eat() {
        System.out.println("animals.Dog eats!");
    }

    @Override
    public void sayHi() {
        System.out.println("Dogs say Hi!");
    }

    @Override
    public void run() {
        System.out.println("animals.Dog runs!");
    }
}
