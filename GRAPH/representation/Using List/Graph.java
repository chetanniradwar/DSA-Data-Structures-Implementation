import java.util.ArrayList;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    public Graph(ArrayList<GraphNode> nodeList)
    {
        this.nodeList = nodeList ;
    }
    public void addUndirectedEdge(int i , int j)
    {
        nodeList.get(i).neighbour.add(nodeList.get(j)) ;
        nodeList.get(j).neighbour.add(nodeList.get(i)) ;
    }

    public void printList()
    {
        for(GraphNode node : nodeList)
        {   System.out.print(node.name+": ");
            for(GraphNode neigh : node.neighbour)
            {
                System.out.print(neigh.name +" -> ");
            }
            System.out.println();
        }
    }

}
