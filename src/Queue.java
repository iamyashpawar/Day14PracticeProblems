public class Queue<T> {

    LinkedList<T> queueLinkedlist = new LinkedList<T>();

    public void enqueue(T data){
        queueLinkedlist.append(data);

    }

    public void display(){
        queueLinkedlist.display();
    }
}
