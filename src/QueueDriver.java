public class QueueDriver {
    public static void main(String[] args) {
        Queue q = new Queue();
        System.out.println("This should say true: " + q.isEmpty());
        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("This should say false: " + q.isEmpty());
        System.out.println("This should say 3: " + q.size());
        System.out.println("This should say false: " + q.dequeue());
        System.out.println("This should say 5: " + q.peek());



    }

}
