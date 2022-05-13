public class TestBSTWithIterator { //using post order
  public static void main(String[] args) {
    BST<String> tree = new BST<>();
    tree.insert("George");
    tree.insert("Michael");
    tree.insert("Tom");
    tree.insert("Adam");
    tree.insert("Jones");
    tree.insert("Peter");
    tree.insert("Daniel");
    
    for (String string : tree) {
      System.out.print((string.toUpperCase() + " "));
    }      
  }
}