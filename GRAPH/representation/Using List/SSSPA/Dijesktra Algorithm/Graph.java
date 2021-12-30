import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

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

    public void addWeightedUndirectedEdge(int i , int j , int weight)
    {
        nodeList.get(i).neighbour.add(nodeList.get(j)) ;
        nodeList.get(j).neighbour.add(nodeList.get(i)) ;
        nodeList.get(i).edgeWeight.add(weight);
        nodeList.get(j).edgeWeight.add(weight) ;
    }

    public void addDirectedEdge(int i , int j)
    {
        nodeList.get(i).neighbour.add(nodeList.get(j));
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
    public void DFS()
    {
        Stack<GraphNode> s = new Stack<GraphNode>();
        s.push(nodeList.get(0));
        while(!s.empty())
        {
            GraphNode node = s.pop();
            node.isvisited = true ;
            System.out.print(node.name+"  ") ;
            for(GraphNode x : node.neighbour)
            {
                    if(!x.isvisited && !s.contains(x))
                    s.push(x);
            }
        }
    }

    public void makeunvisited()
    {
        for(GraphNode x : nodeList)
        {
                x.isvisited = false;
        }
    }


    public void findSSSP()
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
            support(nextvisit, explored);


        }
        public void support(GraphNode current ,Set<GraphNode> explored)
        {

        
            
            // int minValue = Integer.MAX_VALUE;
            // for(GraphNode x : explored)
            // {
            //     if(x.value<minValue)
            //     {
            //         current = x;
            //     }
                
            // }

            for(GraphNode neigh : current.neighbour)
            {   
                // if(!neigh.isvisited)
                // {

                    int cost = current.value + current.edgeWeight.get(current.neighbour.indexOf(neigh));
                    if(cost<neigh.value)
                    {
                        neigh.value=cost;
                    }
                    if(!neigh.isvisited)
                    explored.add(neigh);
                    
                // }
            }
            current.isvisited=true;
            if(!explored.isEmpty())
                {

                    GraphNode nextvisit =null;
                    int min= Integer.MAX_VALUE;
                    for(GraphNode x: explored)
                    {   
                        if(x.value<min)
                        {
                            nextvisit=x;
                        }
                    }
                    explored.remove(nextvisit);
                    support(nextvisit,explored);
                }


            
    }
    public void printSSSP()
    {
       
            for(GraphNode gn :nodeList)
            {  
                System.out.print("Shorted Cost from "+nodeList.get(0).name +" to " + gn.name+" : ");
               
                System.out.println(gn.value);
            }
    }


   

}
