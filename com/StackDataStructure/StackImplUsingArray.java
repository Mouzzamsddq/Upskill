class Stack {
    private int[] a;
    private int top;
    private int stackSize;

    public Stack(int size) {
        this.stackSize = size;
        this.top = -1;
        a = new int[size];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == stackSize - 1;
    }

    public void push(int data) {
        if(isFull()) {
           System.out.println("Stack is full");
        } else {
            a[++top] = data; 
        }
    }

    public int pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return a[top--];
        }
    }

    public int peek() {
         if(isEmpty()) {
            System.out.println("Stack is empty");
            return -1;
        } else {
            return a[top];
        }
    }

    public void print() {
        if(isEmpty()) {
           System.out.println("Stack is empty");
        } else {
           for(int i = 0 ; i <= top ; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        }
    }
    
}
public class StackImplUsingArray {
    public static void main(String []args) {
        Stack st = new Stack(5);
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        st.print();
        st.push(60);
    }
}