public class Myque {
    private String[] data;
    private int front;
    private int rear;
    private int count;

    private int n;

    public Myque(int size) {
        n = size;
        data = new String[size];
        front = 0;
        rear = 0;
        count = 0;
    }

    public void enque(String value) {
        data[rear] = value;
        rear = (rear + 1) % n;
        count++;
    }

    public void deque(String name) {
        String returnValue = data[front];
        front = (front + 1) % n;
        count--;

    }


    public boolean isEmpty() {
        return (count == 0 && front == rear);
    }

    public boolean isFull() {
        return (count == n && front == rear);
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = front; i < front + count; i++) {
                System.out.println(data[i % n] + " ");
            }
            System.out.println("");
        }
    }
}
