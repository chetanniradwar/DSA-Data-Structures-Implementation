import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
nodeList.add(new GraphNode("A", 0));
nodeList.add(new GraphNode("B", 1));
nodeList.add(new GraphNode("C", 2));
nodeList.add(new GraphNode("D", 3));
nodeList.add(new GraphNode("E", 4));

Graph g = new Graph(nodeList);
g.addUndirectedEdge(0,1);
g.addUndirectedEdge(0,4);
g.addUndirectedEdge(0,3);
g.addUndirectedEdge(1,2);
g.addUndirectedEdge(2,3);
g.addUndirectedEdge(4,3);

g.printList();

    }
}
