public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        System.out.print("\033[H\033[2J");
        System.out.println(stack.isEmpty() ? "The stack is empty." : "The stack is not empty.");
        stack.push(10);
        stack.push(100);
        stack.push(1000);
        stack.push(10000);
        System.out.printf("There is %s items in the stack.\n", stack.getSize());
        System.out.printf("%s was popped of the top of the stack.\n",stack.pop());
        System.out.printf("%s was popped of the top of the stack.\n",stack.pop());
        System.out.printf("%s is at the top of the stack.\n",stack.peek());
        System.out.println(stack.isEmpty() ? "The stack is empty." : "The stack is not empty.");

    }
}
