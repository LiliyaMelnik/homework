import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1() {
        System.out.println("--------------------------------TASK1");
        char a = '\u25b6';
        char b = '\u25b7';
        char c = '\u25b8';
        System.out.println(a +"," + b + "," + c);
    }
    public static void task2() {
        System.out.println("--------------------------------TASK2");
        System.out.println(getSum(1));
        System.out.println(getSum(1, 2));
        System.out.println(getSum(1, 2, 3));
        System.out.println(getSum(1L, 2L, 3L));
        System.out.println(getSum('h', 'i', '!'));
        System.out.println(getSum((short)1, (short)2, (short)3));
    }
    public static int getSum(int a) {
        return a;
    }
    public static int getSum(int a, int b) {
        return a + b;
    }
    public static int getSum(int a, int b, int c) {
        return a + b + c;
    }
    public static int getSum(long a, long b, long c) {
        return (int) (a + b + c);
    }
    public static int getSum(char a, char b, char c) {
        return a + b + c;
    }
    public static int getSum(short a, short b, short c) {
        return a + b + c;
    }
    public static void task3() {
        System.out.println("--------------------------------TASK3");
        System.out.println(getCube(2));
    }
    public static int getCube(int a) {
        return a * a * a;
    }
    public static void task4() {
        System.out.println("--------------------------------TASK4");
        System.out.println(plus(1, 2));
        System.out.println(minus(2, 1));
        System.out.println(mult(2, 1));
        System.out.println(div(2, 1));
    }
    public static int plus(int a, int b) {
        return a + b;
    }
    public static int minus(int a, int b) {
        return a - b;
    }
    public static int mult(int a, int b) {
        return a * b;
    }
    public static int div(int a, int b) {
        return a / b;
    }
}
