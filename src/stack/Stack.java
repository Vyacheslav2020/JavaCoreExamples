package stack;

class Stack {
    private int[] array;
    private int tos;

    Stack() {
        array = new int[10];
        tos = -1;
    }

    void push(int item) {
        if (tos == 9) {
            System.out.println("Stack is full");
        } else array[++tos] = item;
    }

    int pop() {
        if (tos == -1) {
            System.out.println("Stack is empty");
            return 0;
        } else return array[tos--];
    }
}
