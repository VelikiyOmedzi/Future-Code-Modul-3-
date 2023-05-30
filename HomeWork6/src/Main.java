public class Main {
    public static void main(String[] args) {
        OmedziQueue q = new OmedziQueue();
        q.enQueue(2);
        q.enQueue(1);
        q.enQueue(5);
        q.enQueue(8);
        q.enQueue(33);

        q.display();
        q.deQueue();
        q.display();
        q.enQueue(9);
        q.display();

        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();
        q.deQueue();

        q.display();

        q.enQueue(2);
        q.enQueue(1);
        q.enQueue(5);
        q.enQueue(342342);
        q.enQueue(4656546);

        q.display();
    }
}