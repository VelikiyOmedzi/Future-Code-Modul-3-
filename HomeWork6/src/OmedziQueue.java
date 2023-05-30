
public class OmedziQueue {
    private final int SIZE = 5;
    private int[] items = new int[SIZE];
    private int front, rear;

    public OmedziQueue() {
        front = -1;
        rear = -1;
    }

    private boolean isFull() {
        if (front == 0 && rear == 5) return true;
        else return false;
    }
    private boolean isEmpty() {
        if (front == -1)
            return true;
         else
            return false;
    }

     void enQueue(int element) {

        if (isFull()) {
            System.out.println("Queue is full");
        } else if (front == -1) {
            front = 0;
            rear = 0;
            items[rear] = element;
        } else {
            rear++;
            items[rear] = element;
            boolean sorted = false;
            int temp;
            while(!sorted) {
                sorted = true;
                for (int i = 0; i < items.length - 1; i++) {
                    if (items[i] < items[i+1]) {
                        temp = items[i];
                        items[i] = items[i+1];
                        items[i+1] = temp;
                        sorted = false;
                    }
                }
            }
        }
    }

     int deQueue () {
        int element;
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return (-1);
        } else {
            element = items[front];
            if (front >= rear) {
                front = -1;
                rear = -1;
            } else {
                if (isFull()) {
                    System.out.println("Queue is full");
                    return element;
                }
                front++;
                int[] n = new int[5];
                System.arraycopy(items, 1, n, 0, n.length - 1);
                front--;
                items = n;
                rear--;
            }
            return (element);
        }
    }

    public void display() {
        int i;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        } else {
            for (i = front; i <= rear; i++) {
                System.out.print(items[i] + "  ");

            }
        }
        System.out.println("\n************************");
    }
}
