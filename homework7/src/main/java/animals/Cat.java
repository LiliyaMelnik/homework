package animals;

public class Cat extends Animal implements Runable {
    @Override
    void sleep() {
        System.out.println("animals.Cat sleeps");
    }

    @Override
    public void run() {
        System.out.println("animals.Cat runs");
    }

    @Override
    void eat() {
        System.out.println("animals.Cat eats");
    }

    @Override
    public void sayHi() {
        System.out.println("Cats say Hi!");
    }
}
