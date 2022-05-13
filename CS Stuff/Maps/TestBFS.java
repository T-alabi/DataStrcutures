public class TestBFS {
  public static void main(String[] args) {
    Integer [] vertices = {0,1,2,3,4};
    int [][] edges ={{0, 1}, {0,4}, {1,2}, {2,3}, {1,0}, {4,0}, {2,1}, {3,2}};    

  Graph<Integer> graph = new UnweightedGraph<>(vertices, edges);
  UnweightedGraph<Integer>.SearchTree bfs = 
    graph.dfs(graph.getIndex(0)); // Get a dfs starting at Chicago

    java.util.List<Integer> searchOrders = bfs.getSearchOrder();
    System.out.println(bfs.getNumberOfVerticesFound() +
      " vertices are searched in this order:");
    for (int i = 0; i < searchOrders.size(); i++)
      System.out.println(graph.getVertex(searchOrders.get(i)));

    for (int i = 0; i < searchOrders.size(); i++)
      if (bfs.getParent(i) != -1)
        System.out.println("parent of " + graph.getVertex(i) + 
          " is " + graph.getVertex(bfs.getParent(i)));

          
  }
}