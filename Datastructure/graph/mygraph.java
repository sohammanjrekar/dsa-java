package Graph;

import java.util.ArrayList;

public class mygraph {

    static class edge {
        int source;
        int destination;

        public edge(int source, int destination) {
            this.source = source;
            this.destination = destination;
        }
    }

    public static void creategraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(new edge(0, 2));
        graph[1].add(new edge(1, 3));
        graph[1].add(new edge(1, 2));
        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 2));

    }

    public static void display(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                System.out.println(graph[i].get(j).source + "  :  " + graph[i].get(j).destination);
            }
        }
    }

    public static void main(String[] args) {
        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        // display(graph);
        creategraph(graph);
        display(graph);

    }
}
