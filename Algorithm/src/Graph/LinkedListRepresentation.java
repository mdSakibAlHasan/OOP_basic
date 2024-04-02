package Graph;

import java.util.LinkedList;

public class LinkedListRepresentation {
    private void addEdge(LinkedList<LinkedList<Integer>> Adj, int u, int v)
    {
        Adj.get(u).add(v);      //undirectional
        Adj.get(v).add(u);
    }

    private void printadjacencylist(LinkedList<LinkedList<Integer> > adj)
    {
        for (int i = 0; i < adj.size(); ++i) {

            // head
            System.out.print(i + "->");

            for (int v : adj.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinkedListRepresentation li = new LinkedListRepresentation();
        int vertex = 5;

        LinkedList<LinkedList<Integer> > adj = new LinkedList<LinkedList<Integer> >();
        for (int i = 0; i < vertex; ++i) {
            adj.add(new LinkedList<Integer>());
        }


        li.addEdge(adj, 0, 1);
        li.addEdge(adj, 0, 4);
        li.addEdge(adj, 1, 2);
        li.addEdge(adj, 1, 3);
        li.addEdge(adj, 1, 4);
        li.addEdge(adj, 2, 3);
        li.addEdge(adj, 3, 4);

        li.printadjacencylist(adj);
    }
}
