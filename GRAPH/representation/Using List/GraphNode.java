import java.util.ArrayList;

public class GraphNode {
    String name;
    int index ;
    ArrayList<GraphNode> neighbour = new ArrayList<GraphNode> ();

GraphNode(String name , int index )
{
    this.name = name;
    this.index= index;
}

}
