import java.util.Map;

public class Vertex <V>{
    private V data;
    private boolean marked;

    public Vertex(V data){
        this.data = data;
    }

    public void setData(V data){
        this.data = data;
    }

    public V getData(){
        return data;
    }

    private Map<Vertex<V>, Double> adjacentVertices;

    public void addAdjacentVertex(Vertex<V> destination, double weight){
        adjacentVertices.put(destination, weight);
    }

    public V getAdjacentVertices(){
        return (V) adjacentVertices;
    }
}
