import java.util.ArrayList;
import java.util.Stack;


public class TopologicalSort {
    public static void main(String[] args) {
        ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
        nodeList.add(new GraphNode("0", 0));
        nodeList.add(new GraphNode("1", 1));
        nodeList.add(new GraphNode("2", 2));
        nodeList.add(new GraphNode("3", 3));
        nodeList.add(new GraphNode("4", 4));
        nodeList.add(new GraphNode("5", 5));
        // nodeList.add(new GraphNode("G", 6));
        // nodeList.add(new GraphNode("H", 7));
        Graph g = new Graph(nodeList);

        // g.addDirectedEdge(0,2);
        // g.addDirectedEdge(1,2);
        // g.addDirectedEdge(1,3); 
        // g.addDirectedEdge(2,4);
        // g.addDirectedEdge(4,7);
        // g.addDirectedEdge(4,5);
        // g.addDirectedEdge(5,6);
        // g.addDirectedEdge(3,5);
        g.addDirectedEdge(3,4);
        g.addDirectedEdge(3,0);
        g.addDirectedEdge(3,0);
        g.addDirectedEdge(2,0);
         tSort(g);



    }
    public static void tSort(Graph g)
    {
       

       
        Stack<GraphNode> ans = new Stack<GraphNode>();
        Stack<GraphNode> temp = new Stack<GraphNode>();
        
         
        for(GraphNode n :g.nodeList)
        {
           if(!ans.contains(n))
           topo(n, ans,temp);
           while(!temp.isEmpty())
           {
                topo(temp.pop(), ans,temp);
           }
        }

        while(!ans.isEmpty())
        {
            System.out.print(ans.pop().name+ " -> ");
        }
     
        
    }
    
    static void topo(GraphNode i ,Stack<GraphNode> ans , Stack <GraphNode> temp)
{
     
            if(i.neighbour==null )
            {
               ans.push(i);
            }
            else
            {   
            int count= 0;
            for(GraphNode x : i.neighbour )
            {
                if(ans.contains(x))
                count++;
            }
            if(count==i.neighbour.size())
            {
            ans.push(i);
            
            }
            if(!ans.contains(i))
            temp.push(i);
           
            for(GraphNode x : i.neighbour)
            {
                if(!ans.contains(x))
                temp.push(x);
            }
           
        }
}
}
  

