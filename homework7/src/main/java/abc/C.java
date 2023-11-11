package abc;

public class C extends B {
    @Override
    public void hello() {
        System.out.println("Hello from C");
    }

    @Override
    public void helloSuper() {
        super.hello();
    }
}
