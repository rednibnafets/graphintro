package graphintro;

import java.util.ArrayList;

/**
 *
 * @author stefan
 */
public class Graph {

    private final ArrayList< Vertex > allVertices ;
    private final ArrayList< Edge > allEdges ;

    public Graph() {
        allVertices = new ArrayList<>();
        allEdges = new ArrayList<>();
    }


    public Graph insertEdge(Edge e) {

        if (!edgeExists(e) ){ 
            allEdges.add(e);
            //
            System.out.println("[insertEdge] Trying to add vertices ...");
            insertVertex(e.getSource()) ;
            insertVertex(e.getDestination()) ;
            //
            System.out.println("  Edge " + e.toString() + " added to graph.");
        } else {
            System.out.println("  Edge exists (cannot be added).  Graph unchanged.");
        }
        return this;
    }

    protected boolean edgeExists(Edge newEdge) {

        boolean edgeExists = false;

        for (Edge e : allEdges) {
            if (  e.getSource() == newEdge.getSource()
               && e.getDestination() == newEdge.getDestination() ) {
                edgeExists = true;
            }
        }
        return edgeExists;
    }    
    
    
    public ArrayList< Vertex > insertVertex(Vertex v) {

        if (!vertexExists(v)) { 
            allVertices.add(v);
            System.out.println("Vertex " + v.getName() + " added to graph.");
        } else {
            System.out.println("Vertex " + v.getName() + " already in graph -> vertex cannot be added (again).");
        }
           
        return allVertices ;
    }

    protected boolean vertexExists(Vertex newVertex) {

        boolean vertexExists = false;

        for (Vertex v : allVertices) {
            if (v.getName().equalsIgnoreCase(newVertex.getName())) {
                vertexExists = true;
            }

        }
        return vertexExists;
    }


//    public int findMaxVertex() {
//
//        int maximum = Integer.MIN_VALUE;
//
//        for (Edge e : graph) {
//            if (e.getV1() > maximum) {
//                maximum = e.getV1();
//            }
//            if (e.getV2() > maximum) {
//                maximum = e.getV2();
//            }
//        }
//        return maximum;
//    }
//
//    public int findMinVertex() {
//
//        int minimum = Integer.MAX_VALUE;
//
//        for (Edge e : graph) {
//            if (e.getV1() < minimum) {
//                minimum = e.getV1();
//            }
//            if (e.getV2() < minimum) {
//                minimum = e.getV2();
//            }
//        }
//        return minimum;
//    }
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

    public int getNumberOfEdges() {
        return allEdges.size();
    }

//    public Edge getEdge(int position) {
//        return graph.get(position);
//    }

    public Graph showDetails() {
        System.out.println("-- Graph Details ----------------------------------");
        System.out.println("   vertex count : " + allVertices.size() );
        System.out.println("   edge count : " + allEdges.size() );
        System.out.println("---------------------------------------------------");
        return this;
    }

    public Graph showEdges() {
        System.out.println("-- Edges ------------------------------------------");
        for (Edge e : allEdges) {
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

    public Graph showAdjacencyList() {
        System.out.println("-- Adjacency List ---------------------------------");
        AdjMatrixI ami = new AdjMatrix(this);
        ami.showAdjList();
        System.out.println("---------------------------------------------------");

        return this;
    }

}
