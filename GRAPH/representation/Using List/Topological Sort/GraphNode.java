import java.util.ArrayList;

public class GraphNode {
    String name;
    int index ;
    boolean isvisited;
    ArrayList<GraphNode> neighbour = new ArrayList<GraphNode> ();

GraphNode(String name , int index )
{
    this.name = name;
    this.index= index;
    this.isvisited =false;
}

}
