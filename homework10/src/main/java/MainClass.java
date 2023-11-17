import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        CustomLinkedList<Integer> arr = new CustomLinkedList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(8);

        arr.addFirst(0);
        System.out.println(arr.size()); //6
        System.out.println(arr.getFirst()); //0
        System.out.println(arr.getLast()); //8
        System.out.println(arr.get(3)); //3

        arr.remove(5); //remove last 8
        System.out.println(arr.getLast()); //4
    }
}
