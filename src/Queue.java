import java.util.NoSuchElementException;
//@param <T>
public class Queue <T>{

    private int size;
    private QueueNode first;
    private QueueNode last;

    public Queue(){
        size =0;
        first = null;
        last = null;
    }

    public void enqueue(T Data){ //add element
        QueueNode data = new QueueNode(Data);
        if (first == null){ //if first
            this.first = data;
            size++;
        }
        else if(last == null){ //second thing
            this.last = data;
            data.setParent(first);
            size++;
        }
        else { //more than 2 in line
            data.setParent(last);
            last=data;
            size++;
        }


    }

    public T dequeue() { //remove and return the least recent element
        if(isEmpty()) throw new NoSuchElementException("Queue Underflow");
        QueueNode<T> toReturn = first;
        QueueNode<T> currNode = last;
        for(int i = size-2; i > 0; i--){
            currNode = last.getParent();
        }
        first = currNode;
        currNode.setParent(null);
        size--;
        return toReturn.get();


    }

    public boolean isEmpty(){
        return first == null;
    }

    public int size(){
        return size;
    }

    public T peek(){ //returns the least recent but does not remove
        if (isEmpty()) throw new NoSuchElementException("Queue underflow");
        QueueNode <T> toReturn = first;
        return toReturn.get();
    }
}
