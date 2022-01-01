import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
    ArrayList<GraphNode> nodeList = new ArrayList<GraphNode>();

    public Graph(ArrayList<GraphNode> nodeList) {
        this.nodeList = nodeList;
    }

    public void addWeightedDirectedEdge(int i, int j, int weight) {
       
        nodeList.get(i).directedEdge.put(nodeList.get(j), weight);

    }

    public void printList() {
        for (GraphNode node : nodeList) {
            System.out.print(node.name + ": ");
            for (GraphNode neigh : node.directedEdge.keySet()   ) {
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
            for (GraphNode x : node.directedEdge.keySet()) {
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
            for (GraphNode x : node.directedEdge.keySet()) {
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

    public void bellmonFord() {

        ArrayList<Double> values = new ArrayList<Double>();
        for (GraphNode x : nodeList) {
            if (x.index == 0) {
                values.add(0d);
                x.value = 0;
            } else {
                values.add(Double.POSITIVE_INFINITY);
                x.value = Double.POSITIVE_INFINITY;
            }

        }

        for (int i = 0; i < nodeList.size() - 1; i++) {
            for (GraphNode parent : nodeList) {
                for (GraphNode neigh : parent.directedEdge.keySet()) {
                    if (parent.value + parent.directedEdge.get(neigh) < neigh.value) {
                        neigh.value = parent.value + parent.directedEdge.get(neigh);

                    }
                }
            }
        }

    }

    public void printSSSP() {

        for (GraphNode gn : nodeList) {
            System.out.print("Shorted Cost from " + nodeList.get(0).name + " to " + gn.name + " : ");

            System.out.println((int) gn.value);
        }
    }

}
