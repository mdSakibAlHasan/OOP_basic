package Graph;

import java.util.Iterator;
import java.util.LinkedList;

public class DFS {
    private int vertex;
    private LinkedList<Integer> adj[];
    public DFS(int v)
    {
        vertex = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    void addEdge(int v, int w)
    {
        adj[v].add(w);
    }

    void DFSUtil(int v, boolean visited[])
    {
        visited[v] = true;
        System.out.print(v + " ");

        Iterator<Integer> i = adj[v].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int v)
    {
        boolean visited[] = new boolean[vertex];
        DFSUtil(v, visited);
    }

    public static void main(String[] args) {
        DFS g = new DFS(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(0, 3);
        g.addEdge(2, 4);
        g.addEdge(2, 3);

        System.out.println("Following is Depth First Traversal " + "(starting from vertex 2)");

        g.DFS(0);
    }

}
