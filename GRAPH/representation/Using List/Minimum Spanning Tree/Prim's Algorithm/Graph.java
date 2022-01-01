import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
    int parent[] ;
    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
       parent = new int[nodeList.size()];
    }

    public void addWeightedUndirectedEdge(int i, int j, int weight) {
       
        nodeList.get(i).weightedEdge.put(nodeList.get(j), weight);
        nodeList.get(j).weightedEdge.put(nodeList.get(i), weight);

    }

    public void printList() {
        for (GraphNode node : nodeList) {
            System.out.print(node.name + ": ");
            for (GraphNode neigh : node.weightedEdge.keySet()   ) {
                System.out.print(neigh.name + " -> ");
            }
            System.out.println();
        }
    }

    public void BFS() {
        Queue<GraphNode> q = new LinkedList<GraphNode>();
        q.add(nodeList.get(0));
        while (!q.isEmpty()) {
            GraphNode node = q.remove();
            node.isvisited = true;
            System.out.print(node.name + " ");
            for (GraphNode x : node.weightedEdge.keySet()) {
                if (x.isvisited == false && !q.contains(x)) {
                    q.add(x);
                }
            }

        }
    }

    public void DFS() {
        Stack<GraphNode> s = new Stack<GraphNode>();
        s.push(nodeList.get(0));
        while (!s.empty()) {
            GraphNode node = s.pop();
            node.isvisited = true;
            System.out.print(node.name + "  ");
            for (GraphNode x : node.weightedEdge.keySet()) {
                if (!x.isvisited && !s.contains(x))
                    s.push(x);
            }
        }
    }

    public void makeunvisited() {
        for (GraphNode x : nodeList) {
            x.isvisited = false;
        }
    }

   

    public void findMST()
    {
           Set<GraphNode> explored = new HashSet<GraphNode>();
           
            // Mark origin value as 0 and all other node value as Infinity

            for(GraphNode x:nodeList )
            {
                    if(x.index==0)
                    x.value=0;
                    else
                    x.value=Integer.MAX_VALUE;
            }
            
            GraphNode  nextvisit = nodeList.get(0);
            support(nextvisit, explored,parent);


        }
        public void support(GraphNode current ,Set<GraphNode> explored, int parent[])
        {

        
        

            for(GraphNode neigh : current.weightedEdge.keySet())
            {   
                // if(!neigh.isvisited)
                // {

                    int cost = current.weightedEdge.get(neigh);
                    if(!neigh.isvisited&&cost<neigh.value)
                    {
                        
                        neigh.value=cost;
                        parent[neigh.index]=current.index;
                    }
                    if(!neigh.isvisited)
                    explored.add(neigh);
                    
                // }
            }
            current.isvisited=true;
            if(!explored.isEmpty())
                {

                    GraphNode nextvisit =null;
                    double min=Double.POSITIVE_INFINITY;
                    for(GraphNode x: explored)
                    {   
                        if(x.value<min)
                        {
                            min=x.value;
                            nextvisit=x;
                        }
                    }

                    explored.remove(nextvisit);
                  
                    support(nextvisit,explored,parent);
                }
            }
    public void printMST() {

        for (int index =0; index<parent.length ;index++) {
            System.out.print("MST path from " + nodeList.get(parent[index]).name + " to " + nodeList.get(index).name + " : "+ (int)nodeList.get(index).value);

            System.out.println();
        }
    }

}
