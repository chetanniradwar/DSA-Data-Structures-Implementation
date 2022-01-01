
import java.util.HashMap;

public class GraphNode {
    String name;
    int index ;
    boolean isvisited;
    double value;

HashMap<GraphNode ,Integer> directedEdge = new HashMap<GraphNode,Integer>(); 
GraphNode(String name , int index )


{
    this.name = name;
    this.index= index;
    this.isvisited =false;
    this.value= Integer.MAX_VALUE;
}

}
