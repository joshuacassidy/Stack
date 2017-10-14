public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(100);
        stack.push(1000);
        stack.push(10000);

        System.out.println(stack.getCount());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());

    }
}
