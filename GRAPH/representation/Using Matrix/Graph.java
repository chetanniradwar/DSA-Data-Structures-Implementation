import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;



public class Graph {
    ArrayList <GraphNode> nodeList = new ArrayList<GraphNode>() ;
    int[][] adjacencyMatrix ;
    public Graph(ArrayList<GraphNode> nodeList)
    {

    
    this.nodeList = nodeList ;
    this.adjacencyMatrix = new int[nodeList.size()][nodeList.size()];
    }

    public void addUndirectedEdge(int i , int j)
    {
                adjacencyMatrix[i][j] = 1;
                adjacencyMatrix[j][i] = 1;
    }
    public void printMatrix()
    {   
        System.out.print("  ");
        for(GraphNode x : nodeList)
        {
                System.out.print(x.name +"  ");
        }
        System.out.println();

        for(int i = 0 ; i<adjacencyMatrix.length ;i++)
        {
            System.out.print(nodeList.get(i).name+" ")   ;
            for(int j = 0 ; j<adjacencyMatrix.length ;j++)
            {
             
                
                System.out.print(adjacencyMatrix[i][j]+"  ");
            }
            System.out.println();
        }
    }
        public ArrayList<GraphNode> getNeighbours(GraphNode node)
        {        int i =node.index;
                ArrayList <GraphNode> neighbour = new ArrayList<GraphNode>();
                    for(int j = 0 ; j <nodeList.size();j++)
                    {
                        if(adjacencyMatrix[i][j]==1)
                        {
                               neighbour.add(nodeList.get(j)); 
                        }
                    }
                    return neighbour ;
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
                   for(GraphNode x : getNeighbours(node))
                   {
                       if(x.isvisited == false && !q.contains(x))
                       {
                            q.add(x);
                       }
                   }
    
                }
        }
    }


