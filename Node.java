public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> nextNode;

    public Node(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return this.data.toString();
    }
}
