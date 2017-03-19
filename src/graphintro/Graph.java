package graphintro;

import java.util.ArrayList;

/**
 *
 * @author stefan
 */
public class Graph {

    private final ArrayList< Edge> graph;
    private int vertexCount;
    private int edgeCount;

    public Graph() {
        graph = new ArrayList<>();
        vertexCount = 0;
        edgeCount = 0;
    }

    public Graph insertEdge(Edge e) {

        if (!edgeExists(e) && !vertexExists(e) ) {
            graph.add(e);
            edgeCount++;
            vertexCount += 2;
            System.out.println(" Edge " + e.getV1() + " - " + e.getV2() + " added to graph.");
        } else if(!edgeExists(e) && vertexExists(e) ) {
            graph.add(e) ;
            edgeCount++ ;
            vertexCount++ ;
            System.out.println(" One vertex of edge " + e.toString() +" exists." 
               + " Edge added to graph." );
        } else {
            System.out.println(" Edge exists (cannot be added).  Graph unchanged.");
        }
        return this;
    }

    protected boolean vertexExists(Edge newEdge) {

        boolean vertexExists = false ;

        for (Edge e : graph) {
            if (  e.getV1() == newEdge.getV1() 
               || e.getV2() == newEdge.getV2() 
               || e.getV1() == newEdge.getV2() 
               || e.getV2() == newEdge.getV1() )
                vertexExists = true ;
        }
        
        return vertexExists ; 

    }    
    
//    protected boolean vertex1Exists(Edge newEdge) {
//
//        boolean v1exists = false ;
//
//        for (Edge e : graph) {
//            if ( e.getV1() == newEdge.getV1() )
//                v1exists = true ;
//        }
//        
//        return v1exists ; 
//
//    }
//
//
//    protected boolean vertex2Exists(Edge newEdge) {
//
//        boolean v2exists = false ;
//
//        for (Edge e : graph) {
//            if ( e.getV2() == newEdge.getV2() )
//                v2exists = true ;
//        }
//        
//        return v2exists ; 
//
//    }   
    
    protected boolean edgeExists(Edge newEdge) {

        boolean edgeExists = false;

        for (Edge e : graph) {
            if (  e.getV1() == newEdge.getV1()
               && e.getV2() == newEdge.getV2()) {
                edgeExists = true;
            }

        }

        return edgeExists;

    }

    public int getNumberOfEdges() {
        return graph.size();
    }

    public Edge getEdge(int position) {
        return graph.get(position);
    }

    public Graph showDetails() {
        System.out.println("-- Graph Details ----------------------------------");
        System.out.println("   vertex count : " + vertexCount);
        System.out.println("   edge count : " + edgeCount);
        System.out.println("---------------------------------------------------");
        return this;
    }

    public Graph showEdges() {
        System.out.println("-- Edges ------------------------------------------");
        for (Edge e : graph) {
            System.out.println(e.toString());
        }
        System.out.println("---------------------------------------------------");
        return this;
    }

    public Graph showAdjacencyMatrix() {
        System.out.println("-- Adjacency Matrix -------------------------------");
        AdjMatrixI ami = new AdjMatrix(this);
        ami.showAdjMatrix();
        System.out.println("---------------------------------------------------");
        return this;
    }

}
