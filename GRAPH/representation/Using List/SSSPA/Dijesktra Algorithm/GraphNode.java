import java.util.ArrayList;

public class GraphNode {
    String name;
    int index ;
    boolean isvisited;
    int value;
    ArrayList<GraphNode> neighbour = new ArrayList<GraphNode> ();
    ArrayList<Integer> edgeWeight = new ArrayList<Integer>();
GraphNode(String name , int index )
{
    this.name = name;
    this.index= index;
    this.isvisited =false;
    this.value= Integer.MAX_VALUE;
}

}
