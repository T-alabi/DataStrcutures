import java.util.Iterator;

public class MyDoublyLinkedList<E> implements MyList<E> {
    private Node<E> head, tail;
private int size;
// Create an empty list 
public MyDoublyLinkedList() {

}
// Create a list from an array of objects 
public MyDoublyLinkedList(E[] objects) { 
    for (int i = 0; i < objects.length; i++)
        add(objects[i]); 
    }
// Return the head element in the list 
public E getFirst() {
    if (size == 0) { return null;
    }
    else {
    return head.element; 
        }
    }
    // Return the last element in the list 
    public E getLast() {
        if (size == 0) { return null;
        }
        else {
        return tail.element; }
        }
        // Add an element to the beginning of the list 
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node 
        newNode.next = head; // link the new node with the head 
        head = newNode; // head points to the new node
        size++; // Increase list size
        if (tail == null) // the new node is the only node in list 
            tail = head;
            if (head != tail) // For a doubly linked list only 
            head.next.previous = head; // For a doubly linked list only
        }
        // Add a new element at the specified index
        public void add(int index, E e) {
            if (index == 0) { addFirst(e);
            }
            else if (index >= size) {
            addLast(e); }
            else {
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
            current = current.next; }
            Node<E> temp = current.next; 
            current.next = new Node<>(e); 
            (current.next).next = temp;
             size++;
            
             temp.previous = current.next;// For a doubly linked list only 
             current.next.previous = current;// For a doubly linked list onlys
            }
        }
    // Add an element to the end of the list
    public void addLast(E e) {
        Node<E> newNode = new Node<E>(e);
        Node<E> temp = tail;
        if (tail == null) {
        head = tail = newNode;
        } else {
        tail.next = newNode; tail = tail.next;
        }
        size++;
        tail.previous = temp; //For a doubly linked list only
        }
        // Remove the last node
        public E removeLast() {
            if (size == 0) { return null;
            }
            else if (size == 1) {
            Node<E> temp = head; head = tail = null;
            size = 0;
            return temp.element;
            }
            else {
            Node<E> current = head;
            for (int i = 0; i < size - 2; i++) { current = current.next;
            }
            Node<E> temp = tail; tail = current; tail.next = null; size--;
            return temp.element; }
            }
    // toString() method
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        Node<E> current = head; for (int i = 0; i < size; i++) {
        result.append(current.element); current = current.next;
        if (current != null) {
        result.append(", "); // Separate two elements with a comma
     }
        else {
        result.append("]"); // Insert the closing ] in the string
        } }
        return result.toString(); }

        
        private class Node<E> { E element;
            Node<E> next;
            Node<E> previous;
            public Node(E o) { element = o;
            } 
        }
        public int size() {
            // Actual implementation is left for practice 
            return size;
            }
            public boolean contains(Object o) {
                // Actual implementation is left for practice 
                return false;
                }
                public Iterator<E> iterator() {
                // Actual implementation is left for practice 
                return null;
                }
                public void clear() {
                    // Actual implementation is left for
                }
        public E get(int index) {
            // Actual implementation is left for 
            return null;
            }
            public int indexOf(Object e) {
            // Actual implementation is left for 
            return 0;
            }
            public int lastIndexOf(E e) {
            // Actual implementation is left for
             return 0;
            }
            public E remove(int index) {
                // Actual implementation is left for
                 return null;
                }
                public E set(int index, E e) {
                // Actual implementation is left for 
                return null;
}


public static void main(String[] args) { // Create a list
    //create a list 
    var myDoublyLinkedList = new MyDoublyLinkedList<Integer>();

    long begin, end, time, sum; // we will measure time it took
    sum = 0;// used to find the average of 5 

            
        
    //repeat 5times

    for(int j = 0; j <5; j++){
          //add 5 elements 
   
          for (int i = 1; i < 5; i++) {

            myDoublyLinkedList.add(i);
            System.out.println("Initial list: " + myDoublyLinkedList + ", head element: " + myDoublyLinkedList.head.element +
            ", head element next: " + ((myDoublyLinkedList.head.next != null)? myDoublyLinkedList.head.next.element.toString(): "null") +
            ", tail element: " + myDoublyLinkedList.tail.element +
            ", tail element next: " + ((myDoublyLinkedList.tail.next != null)? myDoublyLinkedList.tail.next.element.toString(): "null") +
            ", size: " + "Tail element previous" + ((myDoublyLinkedList.tail.previous!=null )? myDoublyLinkedList.tail.previous.element.toString():"null") + myDoublyLinkedList.size + "\n");
            }

              // add 4 more in front of the list
     for (int i = 1; i < 5; i++) {
        myDoublyLinkedList.addFirst(10+i);
       System.out.println("List after modification: " + myDoublyLinkedList +
        ", head element: " + myDoublyLinkedList.head.element +
        ", head element next: " + ((myDoublyLinkedList.head.next != null)? myDoublyLinkedList.head.next.element.toString(): "null") +
        ", tail element: " + myDoublyLinkedList.tail.element +
        ", tail element next: " + ((myDoublyLinkedList.tail.next != null)? myDoublyLinkedList.tail.next.element.toString(): "null") +
        ", size: " + myDoublyLinkedList.size + "\n");
    } 
    

      begin = System.nanoTime();//starting timer before code call

     //remove last 3 elements 
     for (int i = 0; i < 3; i++) {
        myDoublyLinkedList.removeLast();
        System.out.println("List after removal: " + myDoublyLinkedList +
        ", head element: " + myDoublyLinkedList.head.element +
        ", head element next: " + ((myDoublyLinkedList.head.next != null)? myDoublyLinkedList.head.next.element.toString(): "null") + ", tail element: " + myDoublyLinkedList.tail.element +
        ", tail element next: " + ((myDoublyLinkedList.tail.next != null)? myDoublyLinkedList.tail.next.element.toString(): "null") +
        ", size: " + myDoublyLinkedList.size + "\n");
}

      end = System.nanoTime(); //ending timer after code call
      time = end-begin; //this code the time interval it took
     // System.out.println("It took: " + time/4+ " nanoseconds to add 1 elements on average to list ");


     
     
   // find calcs for me
   sum = sum  + ((time/3));
   myDoublyLinkedList.clear();;// clears list for next call
    }
    System.out.println("It took " + sum + " total nancoseconds to run this 5 times, to delete 1 average " + sum/5);

    
    
        

        

}//close main
}

