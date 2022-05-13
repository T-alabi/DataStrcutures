public class TestDFS {
  public static void main(String[] args) {

      Integer [] vertices = {0,1,2,3,4};
      int [][] edges ={{0, 1}, {0,4}, {1,2}, {2,3}, {1,0}, {4,0}, {2,1}, {3,2}};    

    Graph<Integer> graph = new UnweightedGraph<>(vertices, edges);
    UnweightedGraph<Integer>.SearchTree dfs = 
      graph.dfs(graph.getIndex(0)); // Get a dfs starting at Chicago

    java.util.List<Integer> searchOrders = dfs.getSearchOrder();
    System.out.println(dfs.getNumberOfVerticesFound() +
      " vertices are searched in this DFS order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.print(graph.getVertex(searchOrders.get(i)) + " ");
    System.out.println();

    for (int i = 0; i < searchOrders.size(); i++)
      if (dfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) +
          " is " + graph.getVertex(dfs.getParent(i)));

  }
}