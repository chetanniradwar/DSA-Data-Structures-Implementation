import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

    public void BFS()
    {
            Queue <GraphNode> q = new LinkedList<GraphNode>();
            q.add(nodeList.get(0)) ;
            while(!q.isEmpty())
            {
               GraphNode node = q.remove();
               node.isvisited = true;
               System.out.print(node.name +" ");
               for(GraphNode x : node.neighbour)
               {
                   if(x.isvisited == false && !q.contains(x))
                   {
                        q.add(x);
                   }
               }

            }
    }

}
