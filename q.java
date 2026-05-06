class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front = null, rear = null;

    
    void enqueue(int d) {
        Node newNode = new Node(d);

        if (rear == null) { 
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println(d + " is inserted");
    }

   
    void dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        int val = front.data;
        front = front.next;

        if (front == null) { 
            rear = null;
        }

        System.out.println(val + " is deleted");
    }

   
    void peek() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.println("Front: " + front.data);
    }

  
    boolean isEmpty() {
        return front == null;
    }

    
    void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}

class q {
    public static void main(String[] args) {

        Queue q = new Queue();

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);

        q.display();

        q.dequeue();
        q.display();

        q.peek();
    }
}