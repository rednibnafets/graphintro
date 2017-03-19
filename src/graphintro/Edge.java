package graphintro;

/**
 *
 * @author stefan
 */
public class Edge {

    private int v1;
    private int v2;

    public Edge(int v1, int v2) {
        this.v1 = v1;
        this.v2 = v2;
    }
    
    public int getV1() {
        return v1 ;
    }
    
    public int getV2() {
        return v2 ;
    }

    @Override
    public String toString() {
        String edge = v1 +" - " + v2 ;
        return edge;
    }
}
