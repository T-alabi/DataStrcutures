import java.util.*;
public class TestGraph {
  public static void main(String[] args) {
   /* Integer [] vertices = {0, 1, 2, 3, 4};
    int [][] edges ={
    {0, 1}, {0, 2}, {0, 3},
    {1, 0}, {1, 4}, {2, 0},
    {3, 0}, {3, 4}, {4, 1}, {4, 3}
    };

    //Create a graph with 5 vertices using Edge Array
Graph<Integer> graph1 = new UnweightedGraph<>(vertices, edges); 
System.out.println("The number of vertices in graph1: " + graph1.getSize() 
+ "\nThe vertex with index 1 & 2 are " + graph1.getVertex(1) + ", " +
graph1.getIndex(2) + "\nThe edges for graph1:"); graph1.printEdges();

// a List of Edge objects
java.util.ArrayList<Edge> edgeList = new java.util.ArrayList<>();
edgeList.add(new Edge(0, 1)); 
edgeList.add(new Edge(0, 3)); 
edgeList.add(new Edge(1, 4)); 
edgeList.add(new Edge(3, 0)); 
edgeList.add(new Edge(4, 1));
edgeList.add(new Edge(0, 2)); 
edgeList.add(new Edge(1, 0)); 
edgeList.add(new Edge(2, 0)); 
edgeList.add(new Edge(3, 4)); 
edgeList.add(new Edge(4, 3)); 

// Create a graph with the same vertices using a List of Edge objects
Graph<Integer> graph2 = new UnweightedGraph<>(Arrays.asList(vertices), edgeList); 
System.out.println("\n\nThe number of vertices in graph2: " + graph2.getSize() + "\nThe edges for graph2:");
graph2.printEdges();

((UnweightedGraph<Integer>) graph1).createAdjacencyLists( edges, graph1.getSize() ); 
((UnweightedGraph<Integer>) graph2).createAdjacencyLists( edgeList, graph1.getSize() );

Integer [] vertices = {0, 1, 2, 3, 4};
    int [][] edges ={
    {0, 1, 186}, {0, 2, 155}, {0, 3, 155},
    {1, 0,186}, {1, 4, 243}, {2, 0, 155},
    {3, 0, 155}, {3, 4, 117}, {4, 1, 243}, {4, 3, 117}


*/
   ////////////////
   
   Integer [] vertices2 = {0,1,2,3,4};
   int [][] edges2 ={{0, 1}, {0,4}, {1,2}, {2,3}, {1,0}, {4,0}, {2,1}, {3,2}};    

    //create graph using edge array
    Graph<Integer> graph3 = new UnweightedGraph<>(vertices2, edges2);
    System.out.println("The number of vertices in graph3: " + graph3.getSize() 
    + "\nThe vertex with index 1 & 2 are " + graph3.getVertex(1) + ", " +
    graph3.getIndex(2) + "\nThe edges for graph3:"); graph3.printEdges();

    //creating edge objects 
    java.util.ArrayList<Edge> edgeList2 = new java.util.ArrayList<>();
    edgeList2.add(new Edge(0, 1)); 
    edgeList2.add(new Edge(0, 4));
    edgeList2.add(new Edge(1, 2));
    edgeList2.add(new Edge(2, 3));
    edgeList2.add(new Edge(1, 0));
    edgeList2.add(new Edge(4, 0));
    edgeList2.add(new Edge(2, 1));
    edgeList2.add(new Edge(3, 2));

    Graph<Integer> graph4 = new UnweightedGraph<>(Arrays.asList(vertices2), edgeList2); 
    System.out.println("\n\nThe number of vertices in graph4: " + graph4.getSize() + "\nThe edges for graph4:");
    graph4.printEdges();

    ((UnweightedGraph<Integer>) graph3).createAdjacencyLists( edges2, graph3.getSize() ); 
    ((UnweightedGraph<Integer>) graph4).createAdjacencyLists( edgeList2, graph4.getSize() );
  }
}