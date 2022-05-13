public class TestWeightedGraph {
  public static void main(String[] args) {


  /*  WeightedGraph<String> graph1 = 
    new WeightedGraph<>(vertices, edges);
  System.out.println("The number of vertices in graph1: " 
    + graph1.getSize());
  System.out.println("The vertex with index 1 is " 
    + graph1.getVertex(1));
  System.out.println("The index for Miami is " + 
    graph1.getIndex("Miami"));
  System.out.println("The edges for graph1:");
  graph1.printWeightedEdges(); */

    Integer [] vertices = {0, 1, 2, 3, 4};
    int [][] edges ={
    {0, 1, 186}, {0, 2, 155}, {0, 3, 155},
    {1, 0,186}, {1, 4, 243}, {2, 0, 155},
    {3, 0, 155}, {3, 4, 117}, {4, 1, 243}, {4, 3, 117}
    };

    WeightedGraph<Integer> graph1 = new WeightedGraph<>(vertices, edges);
   /* System.out.println("The number of vertices in graph: " 
    + graph1.getSize());
  System.out.println("The vertex with index 1 is " 
    + graph1.getVertex(1));
  System.out.println("The index for Miami is " + 
  graph1.getIndex(5));*/
 // System.out.println("The edges for graph1:");
//  graph1.printWeightedEdges();


 System.out.println("The number of vertices in graph1:" + graph1.getSize() + 
 "\nThe vertices with indexes 1 & 2 are"  + graph1.getVertex(1) + " " + graph1.getIndex(2) +"\nThe edges for graph1:");
 graph1.printWeightedEdges();
System.out.print("The MST: ");
graph1.getMinimumSpanningTree().printTree();
System.out.println("The total minimum weight is: " +
graph1.getMinimumSpanningTree().getTotalWeight());
for (int i = 0; i < 5; i++)
for (int j = 0; j < 5; j++) {
graph1.getShortestPath(i).printPath(j); System.out.println();
}

    edges = new int[][] {
      {0, 1, 2}, {0, 3, 8}, 
      {1, 0, 2}, {1, 2, 7}, {1, 3, 3},
      {2, 1, 7}, {2, 3, 4}, {2, 4, 5},
      {3, 0, 8}, {3, 1, 3}, {3, 2, 4}, {3, 4, 6},
      {4, 2, 5}, {4, 3, 6}
    };
    WeightedGraph<Integer> graph2 = new WeightedGraph<>(edges, 5);
   // System.out.println("\nThe edges for graph2:");
   // graph2.printWeightedEdges();
  }
}