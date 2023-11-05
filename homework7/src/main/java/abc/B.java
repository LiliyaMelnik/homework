package abc;

public class B extends A {
    @Override
    public void hello() {
        System.out.println("Hello from B");
    }

    @Override
    public void helloSuper() {
        super.hello();
    }
}
