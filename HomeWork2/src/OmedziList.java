public class OmedziList<E> {

    private int size;
    Node last;

    Node first;
    private class Node {
        E item;
        Node next;
        Node(E element) {
            this.item = element;
            this.next = null;
        }
        Node(E element, Node next) {
            this.item = element;
            this.next = next;
        }

    }
    OmedziList() {
        this.size = 0;
        this.last = null;
        this.first = null;
    }
    private Node getNode(int index) {
        if(index < 0 || index >= size) throw new IndexOutOfBoundsException();
        Node node = first;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }
    public E get(int index) {
        Node node = getNode(index);
        return node.item;
    }
    public void add(E element) {
        if (first == null) {
            Node node = new Node(element);
            first = node;
            last = node;
        }
        else {
            Node node = new Node(element, null);
            last.next = node;
            last = node;
        }
        size++;
    }
    public int getSize() {
        return size;
    }
    public boolean remove(int index) {
        if (size == 1) {
            first = null;
            last = null;
        }
        else if (first == null) throw new NullPointerException();
        else {
            Node node = getNode(index - 1);
            node.next = getNode(index + 1);

        }
        size--;
        return true;
    }
}
