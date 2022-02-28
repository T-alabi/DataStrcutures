public class TestQueue {
    public static void main(String[] args) {
      java.util.Queue<String> queue = new java.util.LinkedList<>();
      queue.offer("Oklahoma");
      queue.offer("Indiana");
      queue.offer("Georgia");
      queue.offer("Texas");
  
      java.util.Queue<Integer> testLinkedList = new java.util.LinkedList<>();
      //TESTING OFFER METHOD
      testLinkedList.offer(1);
      testLinkedList.offer(2);
      testLinkedList.offer(3);
      testLinkedList.offer(4);
      testLinkedList.offer(5);
      //TESTING ADD METHOD
      testLinkedList.add(6);
      testLinkedList.add(7);
      //TESTING ELEMENT METHOD
      System.out.println(testLinkedList.element());
    //TESTING PEEK METHOD
    Integer a = testLinkedList.peek();
    System.out.println("peeK: " + a);
    //TESTING POLL METHOD
    System.out.println("poll"+ testLinkedList.poll());
    //TESTING REMOVE METHOD 
    System.out.println("remove"+ testLinkedList.remove());



      while (queue.size() > 0)
        System.out.print(queue.remove() + " ");
        while (queue.size() > 0)
        System.out.print(testLinkedList.remove() + " ");
    }
   
}
  
