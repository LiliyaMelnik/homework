import animals.Bird;
import animals.Cat;
import animals.Dog;
import abc.A;
import abc.B;
import abc.C;
import cars.Car;

public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("-------------------------TASK1");
        Dog dog = new Dog();
        Cat cat = new Cat();
        Bird bird = new Bird();
        dog.sayHi();
        cat.run();
        bird.fly();
    }
    public static void task2() {
        System.out.println("-------------------------TASK2");
        A a = new A();
        a.hello();
        a.helloSuper();
        B b = new B();
        b.hello();
        b.helloSuper();
        C c = new C();
        c.hello();
        c.helloSuper();
    }
    public static void task3() {
        System.out.println("-------------------------TASK3");
        Car mazda = new Car("V6", "blue");
        mazda.setColor("green");
        mazda.setColor("red");
    }
}