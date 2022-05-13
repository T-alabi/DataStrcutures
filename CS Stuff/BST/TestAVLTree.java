public class TestAVLTree {
  public static void main(String[] args) {
      AVLTree<Character> tree = new AVLTree<>();
      tree.insert('S');
      tree.insert('T');
      tree.insert('O');
      tree.insert('P');
      tree.forEach(i -> System.out.print(i));
  }
}