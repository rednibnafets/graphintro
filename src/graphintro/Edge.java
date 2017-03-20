package graphintro;

/**
 *
 * @author stefan
 */
public class Edge {

    private final Vertex src ;   // source
    private final Vertex dest ;  // destination
    private final boolean tied ; // connection between src and dest established

    public Edge(Vertex v1, Vertex v2) {
        src  = v1;
        dest = v2;
        tied = true ;
    }
    
    public Vertex getSource() {
        return src ;
    }
    
    public Vertex getDestination() {
        return dest ;
    }
    
    public boolean tiedTogether(){
        return tied ;
    }

    @Override
    public String toString() {
        String edge = src.getName() +" - " + dest.getName() ;
        return edge;
    }
}
