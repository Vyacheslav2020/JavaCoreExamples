package stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack();

        for (int i = 10; i <= 20; i++) {
            stack.push(i);
        }
        System.out.println();

        for (int i = 10; i <= 20; i++) {
            System.out.println(stack.pop());
        }
    }
}
