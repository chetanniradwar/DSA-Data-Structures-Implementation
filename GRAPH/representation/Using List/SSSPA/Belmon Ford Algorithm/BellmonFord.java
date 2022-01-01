import java.util.ArrayList;

public class BellmonFord {
    public static void main(String[] args) {



    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
nodeList.add(new GraphNode("S", 0));
nodeList.add(new GraphNode("V1", 1));
nodeList.add(new GraphNode("V2", 2));
nodeList.add(new GraphNode("V3", 3));
nodeList.add(new GraphNode("V4", 4));
nodeList.add(new GraphNode("E", 5));


Graph g = new Graph(nodeList);
g.addWeightedDirectedEdge(0,1,8);
g.addWeightedDirectedEdge(0,2,4);
g.addWeightedDirectedEdge(1,3,2);
g.addWeightedDirectedEdge(1,2,-5);
g.addWeightedDirectedEdge(2,4,4);
g.addWeightedDirectedEdge(2,3,-2);
g.addWeightedDirectedEdge(4,3,10);
g.addWeightedDirectedEdge(3,5,-2);
g.addWeightedDirectedEdge(5,3,5);
g.addWeightedDirectedEdge(4,5,9);
g.addWeightedDirectedEdge(5,4,-3);



g.printList();
g.bellmonFord();

g.printSSSP();
    }
}
