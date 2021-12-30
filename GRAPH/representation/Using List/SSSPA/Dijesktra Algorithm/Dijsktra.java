import java.util.ArrayList;

public class Dijsktra {
    public static void main(String[] args) {
        
    
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
nodeList.add(new GraphNode("0", 0));
nodeList.add(new GraphNode("1", 1));
nodeList.add(new GraphNode("2", 2));
nodeList.add(new GraphNode("3", 3));
nodeList.add(new GraphNode("4", 4));
nodeList.add(new GraphNode("5", 5));
nodeList.add(new GraphNode("6", 6));
nodeList.add(new GraphNode("7", 7));
nodeList.add(new GraphNode("8", 8));

Graph g = new Graph(nodeList);
g.addWeightedUndirectedEdge(0,1,4);
g.addWeightedUndirectedEdge(0,7,8);
g.addWeightedUndirectedEdge(1,7,11);
g.addWeightedUndirectedEdge(1,2,8);
g.addWeightedUndirectedEdge(2,3,7);
g.addWeightedUndirectedEdge(2,8,2);
g.addWeightedUndirectedEdge(2,5,4);
g.addWeightedUndirectedEdge(3,5,14);
g.addWeightedUndirectedEdge(3,4,9);
g.addWeightedUndirectedEdge(5,4,10);
g.addWeightedUndirectedEdge(7,8,7);
g.addWeightedUndirectedEdge(8,6,6);
g.addWeightedUndirectedEdge(7,6,1);
g.addWeightedUndirectedEdge(6,5,2);
g.printList();
g.findSSSP();
g.printSSSP();

    }
}
