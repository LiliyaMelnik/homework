import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Liliya", "Melnik", 30, "lili@gmail.co"));
        users.add(new User("Lil", "Melnikova", 31, "lili@gmail.com"));
        users.add(new User("Liliy", "Melnik", 32, "liliy@gmail.com"));
        users.add(new User("Lilianna", "Melnikovaya", 33, "liliyya@gmail.com"));
        task1(users);
        task2(users);
    }
    public static void task1(List<User> users) {
        System.out.println("-------------------------TASK1");

        users.stream()
                .filter(u -> u.getAge() < 33)
                .map(u -> u.getSurname())
                .distinct()
                .forEach(f -> System.out.println(f));
    }
    public static void task2(List<User> users) {
        System.out.println("-------------------------TASK2");
        String s = users.stream()
                .filter(u -> u.getSurname().length() < 8)
                .map(u -> u.getName())
                .findFirst()
                .orElseThrow(() -> new NoNameException("no name in list"));
        System.out.println(s);
    }
}
