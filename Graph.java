import java.io.*;
import java.util.*;
public class Graph
{
    private int V;
    private LinkedList<Integer> adj[];
    Graph(int v)
    {
        V = v;
        adj = new LinkedList<Integer>[V];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList<Integer>();
    }
    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }
    void DFSUtil(int v,boolean visited[])
    {
        visited[v] = true;
        System.out.print(v+" ");
        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext())
        {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }
    void DFS(int v)
    {
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++) {
          visited[i] = false;
        }
        for (int i = 0; i < V; i++) {
          if(visited[i] == false){
            DFSUtil(i, visited);
            System.out.println();
          }
        }
    }

    public static void main(String args[])
    {
        Graph g = new Graph(4);

        g.addEdge(0, 5);
        g.addEdge(1, 4);
        g.addEdge(2, 0);
        g.addEdge(3, 3);
        g.addEdge(4, 1);
        g.addEdge(5, 6);
        g.addEdge(6, 2);

        g.DFS(0);
    }
}
