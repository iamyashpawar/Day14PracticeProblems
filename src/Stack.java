public class Stack<T> {
    LinkedList<T> stackLinkedlist = new LinkedList<>();


    public void push(T data) {
        stackLinkedlist.append(data);
    }
    public void display()
    {
        stackLinkedlist.display();
    }
}
