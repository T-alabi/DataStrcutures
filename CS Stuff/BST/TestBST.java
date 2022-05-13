public class TestBST {
  public static void main(String[] args) {
    Integer[] numbers = {5,4,8,7,3,2 };
      BST<Integer> intTree = new BST<>(numbers); 
     
    // intTree.preorder();
    productNode(intTree);
     }

    
     public static <E> void printNodes(BST<E> a){
      //this.forEach(i-> System.out.print(i + " "));
      for (Object ints : a){
        System.out.println(ints);
      }
    }

    public static int productNode(BST<Integer> a){

      int product = 1;
      for(int ints : a){
        product = product*  ints;
      }
      

      return product;
    }

 
    
 }