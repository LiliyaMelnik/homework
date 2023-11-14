import car.Car;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1() {
        System.out.println("-------------------------TASK1");
        Car a = new Car();
        a.setModel("ht1"); // ok
        a.setModel(""); // not ok
        a.setYear(2020); // ok
        a.setYear(2025); // not ok
    }
    public static void task2() {
        System.out.println("-------------------------TASK2");
        int size = 10;
        ArrayList<Integer> arr = new ArrayList<>(size);
        for (int i = 0 ; i < size; i++) {
            arr.add(i + 2);
        }
        System.out.println(arr);
        arr.remove(9);
        arr.remove(8);
        arr.remove(7);
        System.out.println(arr);
        arr.set(3,22);
        System.out.println(arr);
    }
    public static void task3() {
        System.out.println("-------------------------TASK3");
        ArrayList<String> lang = new ArrayList<>();
        ArrayList<String> lang2 = new ArrayList<>();
        lang.add("Java");
        lang.add("Python");
        lang.add("Perl");
        lang.add("C++");
        lang.add("Java");
        lang.add("C++");
        lang.add("C#");
        System.out.println(lang);
        for (String a: lang) {
            if (!lang2.contains(a)) {
                lang2.add(a);
            }
        }
        System.out.println(lang2);
    }
}