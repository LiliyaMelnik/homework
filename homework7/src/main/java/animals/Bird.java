package animals;

public class Bird extends Animal implements Flyable {
    @Override
    void sleep() {
        System.out.println("animals.Bird sleeps");
    }

    @Override
    void eat() {
        System.out.println("animals.Bird eats");
    }

    @Override
    public void sayHi() {
        System.out.println("Birds say Hi!");
    }

    @Override
    public void fly() {
        System.out.println("Birds flies");
    }
}
