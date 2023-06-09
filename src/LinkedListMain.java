public class LinkedListMain {

    public static void main(String[] args) {

        Stack<Integer> stackList = new Stack<>();
        stackList.push(70);
        stackList.push(30);
        stackList.push(56);
        stackList.display();

        stackList.peek();

        stackList.display();

        stackList.pop();

        stackList.display();

        System.out.println("Queue Operation using linedlist");
        Queue<Integer> queueList = new Queue<>();
        queueList.enqueue(56);
        queueList.enqueue(30);
        queueList.enqueue(70);

        queueList.display();

        queueList.dequeue();
        queueList.display();
    }
}
