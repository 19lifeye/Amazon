import java.util.Iterator;
import java.util.LinkedList;

class BFS
{
    private int V;
    private LinkedList<Integer> adj[];

    // Make a node
    BFS(int v)
    {
        this.V = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i] = new LinkedList<>();
        } 
    }

    // add edge to verties
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    void BFSGraph(int s)
    {
        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        while(queue.size()!=0)
        {
            s = queue.poll();
            System.out.println(s+ " ");

            Iterator<Integer> i = adj[s].listIterator();
            while(i.hasNext())
            {
                int n = i.next();
                if(!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }
    public static void main(String[] args) {
        
        BFS b = new BFS(4);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);
        
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 

        b.BFSGraph(2);
    }
}