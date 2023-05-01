public class LinkedList<T> {

   Node<T> head;
   Node<T> tail;


    public void append(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null){
            head = newNode;
            tail = newNode;
        }else {
            tail.next =newNode;
            tail = newNode;
        }

    }


    public void display() {
        Node<T> temp = head   ;
        while (temp != null)
        {
            System.out.print(temp.data + "->");
            temp= temp.next;
        }
        System.out.println();
    }

    public void peak() {
        Node<T> temp = tail;
        while (temp!= null){
            System.out.println(temp.data);
            temp= temp.next;

        }
        System.out.println();

    }

    public T pop() {
        T popData = tail.data;
        Node<T> temp = head;
        while (temp.next != null){
            temp = temp.next;

        }
        temp.next = null  ;
        tail = temp;
        return popData;

    }

}
