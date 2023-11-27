import java.util.NoSuchElementException;
public class CustomLinkedList<T> {
    private int size;
    private Node<T> first;
    private Node<T> last;
    public void add(T element) {
        Node<T> node;
        if (first == null) {
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, null, last);
            last.next = node;
        }
        last = node;
        size++;
    }
    public int size() {
        return size;
    }
    public T get(int index) {
        return getNodeByIndex(index).element;
    }
    private Node<T> getNodeByIndex(int index) {
        Node<T> node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public void remove(int index) {
        Node<T> current = getNodeByIndex(index);
        if (index == 0) {
            first = current.next;
        } else if (index == size -1) {
            Node<T> newLastNode = current.prev;
            newLastNode.next = null;
            last = newLastNode;
        } else {
            Node<T> beforeNode = current.prev;
            Node<T> afterNode = current.next;
            beforeNode.next = afterNode;
            afterNode.prev = beforeNode;
        }
        size--;
    }
    public T getFirst() {
         Node<T> gf = first;
        if (gf == null)
            throw new NoSuchElementException();
        return gf.element;
    }
    public T getLast() {
        Node<T> gl = last;
        if (gl == null)
            throw new NoSuchElementException();
        return gl.element;
    }
    public void addFirst (T element) {
        Node<T> node;
        if (first == null) {
            node = new Node<>(element, null, null);
            first = node;
        } else {
            node = new Node<>(element, first, null);
            first.prev = node;
        }
        first = node;
        size++;
    }
    private static class Node<T> {
        T element;
        Node<T> next;
        Node<T> prev;
        public Node(T element, Node<T> next, Node<T> prev) {
            this.element = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
