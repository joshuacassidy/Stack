public class Stack<T extends Comparable<T>> {
    private Node<T> root;
    private int size;

    public void push(T newData){
        size++;

        if(root == null){
            root = new Node<>(newData);
        } else{
            Node<T> oldRoot = root;
            root = new Node<>(newData);
            root.setNextNode(oldRoot);
        }
    }

    public T pop(){
        T itemToPop = root.getData();

        root = root.getNextNode();
        size--;
        return itemToPop;
    }

    public T peek(){
        return root.getData();
    }


    public int getSize() {
        return size;
    }

    public boolean isEmpty(){
        return root == null;
    }

}
