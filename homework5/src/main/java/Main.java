import static java.lang.String.format;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("-----------------------TASK1");
        String s = "Hello";
        String d = "World";
        System.out.println(s + d);
        System.out.println(s.concat(d));
        System.out.println(format("%s%s", s, d));
    }
    public static void task2() {
        System.out.println("-----------------------TASK2");
        middle("Concatenation");
        middle("String");
        middle("Code");
    }
    public static void middle(String a) {
        char [] chars = new char[2];
        int middle = a.length()/2-1;
        a.getChars(middle , middle+2, chars, 0);
        System.out.println(chars);
    }
    public static void task3() {
        System.out.println("-----------------------TASK3");
        String [] name = {"Vasya", "Kolya", "Vanya"};
        String [] surname = {"Ivanov", "Petrov", "Sidorov"};
        String [] faculty = {"Mathematics", "Economics", "IT"};
        System.out.println(format("student [%s] [%s] [%s]", name[0], surname[0], faculty[0]));
        System.out.println(format("student [%s] [%s] [%s]", name[1], surname[1], faculty[1]));
        System.out.println(format("student [%s] [%s] [%s]", name[2], surname[2], faculty[2]));
    }
}