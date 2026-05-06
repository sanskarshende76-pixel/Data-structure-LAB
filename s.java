class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }
}

class Stack {
    Node top = null;

   
    void push(int d) {
        Node newnode = new Node(d);
        newnode.next = top;
        top = newnode;
        System.out.println(d + " is pushed");
    }

  
    void pop() {
        if (this.isempty()) {
            System.out.println("Stack is empty");
            return; 
        }
        int da = top.data;
        top = top.next;
        System.out.println(da + " is popped");
    }

   
    boolean isempty() {
        return top == null;
    }

    
    void peek() {
        if (this.isempty()) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.println("Top: " + top.data);
    }

  
    void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node temp = top;
        System.out.print("Stack: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class s{
    public static void main(String[] args) {

        Stack s = new Stack(); 

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();

        s.pop();   
        s.display();

        s.peek();
    }
}