public class Stack<T extends Comparable<T>> {
    private Node<T> root;
    private int count;

    public void push(T newData){
        count++;

        if(root == null){
            root = new Node<>(newData);
        } else{
            Node<T> oldRoot = root;
            root = new Node<>(newData);
            root.nextNode = oldRoot;
        }
    }

    public T pop(){
        T itemToPop = root.data;
        root = root.nextNode;
        count--;
        return itemToPop;
    }

    public T peek(){
        return root.data;
    }


    public int getCount() {
        return count;
    }

    public boolean isEmpty(){
        return root == null;
    }

}
