
public class CirculerQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    protected int end = 0;
    protected int front = 0;

    private int size = 0;

    public CirculerQueue() {
        this(DEFAULT_SIZE);
    }

    public CirculerQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length - 1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front++];
        front = (front + 1) % data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i = (i + 1) % data.length;
        } while (i != end);
        System.out.println("END");
    }

    public static void main(String[] args) {
        CirculerQueue queue = new CirculerQueue(5);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.insert(50);

        queue.display();

        try {
            System.out.println("Removed: " + queue.remove());
            System.out.println("Front: " + queue.front());
            queue.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
