public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("------------------------TASK1");
        Car car1 = new Car("v8", "manual");
        Car car2 = new Car("v8", "manual");

        System.out.println(car1.equals(car2));
        car1.setEngine("V6");
        System.out.println(car1.getEngine());
    }
    public static void task2() {
        System.out.println("------------------------TASK2");
        Car car1 = new Car("v8");
        Car car2 = new Car("v8");
        System.out.println(car1.equals(car2));
    }
    public static void task3() {
        System.out.println("------------------------TASK3");
        Car car1 = new Car("v8", "manual");
        System.out.println(car1);
    }
}
