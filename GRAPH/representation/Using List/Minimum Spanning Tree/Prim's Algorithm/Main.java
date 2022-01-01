import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    nodeList.add(new GraphNode("0", 0));
    nodeList.add(new GraphNode("1", 1));
    nodeList.add(new GraphNode("2", 2));
    nodeList.add(new GraphNode("3", 3));
    nodeList.add(new GraphNode("4", 4));
    nodeList.add(new GraphNode("5", 5));
    // nodeList.add(new GraphNode("", 6));
    // nodeList.add(new GraphNode("8", 7));
    // nodeList.add(new GraphNode("5", 5));
    
    
    
    Graph g = new Graph(nodeList);
    g.addWeightedUndirectedEdge(0,1,4);
    g.addWeightedUndirectedEdge(0,2,6);
    g.addWeightedUndirectedEdge(1,2,6);
    g.addWeightedUndirectedEdge(2,3,1);
    g.addWeightedUndirectedEdge(1,3,3);
    g.addWeightedUndirectedEdge(3,4,2);
    g.addWeightedUndirectedEdge(3,5,3);
    g.addWeightedUndirectedEdge(4,5,7);
    g.addWeightedUndirectedEdge(1,4,4);
    // g.addWeightedUndirectedEdge(5,6,6); 
    // g.addWeightedUndirectedEdge(6,7,20);
    
    
    
    g.printList();
    g.findMST();
    
    g.printMST();
    }
}
