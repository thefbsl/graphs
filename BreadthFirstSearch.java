import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch<V> extends Search<V>{

    public BreadthFirstSearch(MyGraph<V> graph, V source) {
        super(source);
        bfs(graph, source);
    }

    private void bfs(MyGraph<V> graph, V current) {
        marked.add(current);
        Queue<V> queue = new LinkedList<>();
        queue.add(current);
        while (!queue.isEmpty()) {
            V v = queue.poll();
            for (V vertice : graph.adjacencyList(v)) {
                if (!marked.contains(vertice)) {
                    marked.add(vertice);
                    edgeTo.put(vertice, v);
                    queue.add(vertice);
                }
            }
        }
    }
}


