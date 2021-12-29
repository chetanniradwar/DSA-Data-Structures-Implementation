import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
    
    
    public class Solution {
        public static void main(String[] args) {
            ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();
            nodeList.add(new GraphNode("A", 0));
            nodeList.add(new GraphNode("B", 1));
            nodeList.add(new GraphNode("C", 2));
            nodeList.add(new GraphNode("D", 3));
            nodeList.add(new GraphNode("E", 4));
            nodeList.add(new GraphNode("F", 5));
            nodeList.add(new GraphNode("G", 6));
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
            // g.addDirectedEdge(3,4);
            // g.addDirectedEdge(3,0);
            // g.addDirectedEdge(3,0);
            // g.addDirectedEdge(2,0);
            g.addUndirectedEdge(0, 1);
            g.addUndirectedEdge(0, 2);
            g.addUndirectedEdge(1, 6);
            g.addUndirectedEdge(1, 3);
            g.addUndirectedEdge(2, 3);
            g.addUndirectedEdge(2, 4);
            g.addUndirectedEdge(3, 5);
            g.addUndirectedEdge(5, 6);
            g.addUndirectedEdge(4, 5);
            // g.addUndirectedEdge(0, 1);
            // g.addUndirectedEdge(0, 1);
            g.printList();
            SSSPBFS(g,4);
    
    
    
        }
        public static void SSSPBFS(Graph g , int origin)
        {
            // String parent[] = new int[g.nodeList.size()];
            Queue <GraphNode> q = new LinkedList<GraphNode>();
            q.add(g.nodeList.get(origin));

            while(!q.isEmpty())
            {
                GraphNode temp =q.remove();
                if(!temp.isvisited)
                {

                    temp.isvisited=true;
                    for(GraphNode neigh : temp.neighbour)
                    {   
                        if(!neigh.isvisited && !q.contains(neigh))
                        {
                            neigh.parent = temp;
                            q.add(neigh);
                        }
                    }
                }
            }
            Stack<GraphNode> s = new Stack<GraphNode>();
            for(GraphNode gn : g.nodeList)
            {  
                System.out.print("Shorted Path from "+g.nodeList.get(origin).name +" to " + gn.name+" : "+g.nodeList.get(origin).name  );
                while(gn.parent!=null)
                {
                   s.push(gn);
                   gn=gn.parent;
                   

                }
                while(!s.isEmpty())
                {
                    System.out.print(" -> " + s.pop().name);
                }
                System.out.println();
            }
        }
        
    }
      
    
    
