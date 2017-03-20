package graphintro;

/**
 *
 * @author stefan
 */
public class GraphIntro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        test1();
 
        
    }



    /*
    *  instantiate a Graph object
    *  add some Edges to it
    *  display the Graph
    *
     */
    public static int test1() {
        Graph g = new Graph();
        Vertex v1 = new Vertex("1") ;
        Vertex v2 = new Vertex("2") ;
        Vertex v3 = new Vertex("3") ;        
        Vertex v4 = new Vertex("4") ;
        Vertex v5 = new Vertex("5") ;
        Vertex v6 = new Vertex("6") ;  
        Edge e1 = new Edge(v6,v4) ;
        Edge e2 = new Edge(v4,v5) ;
        Edge e3 = new Edge(v4,v3) ;
        Edge e4 = new Edge(v3,v2) ;
        Edge e5 = new Edge(v5,v2) ;
        Edge e6 = new Edge(v5,v1) ;
        Edge e7 = new Edge(v2,v1) ;        
        
        
        g.insertEdge(e1) ;
        g.insertEdge(e2) ;
        g.insertEdge(e3) ;
        g.insertEdge(e4) ;
        g.insertEdge(e5) ;
        g.insertEdge(e6) ;
        g.insertEdge(e7) ;

        g.insertVertex(v1) ;
        g.insertVertex(v2) ;
        g.insertVertex(v3) ;
        g.insertVertex(v4) ;
        g.insertVertex(v5) ;
        g.insertVertex(v6) ;        
        

        g.showEdges() ;
        g.showDetails() ;
        
        return 0;
        
    }

}
