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
        //test1();
        //test2() ;
        //test3() ;
        test4() ;
        
    }

    
   /*
    *  instantiate a Graph object
    *  add some Edges to it
    *  display the Graph
    *
     */
    public static int test4() {
        Graph g = new Graph();
        Edge e1 = new Edge(3,7);
        Edge e2 = new Edge(1,8);
        Edge e3 = new Edge(7,8);
        Edge e4 = new Edge(0,5);
        Edge e5 = new Edge(5,2);
        Edge e6 = new Edge(3,8);
        Edge e7 = new Edge(2,9);
        Edge e8 = new Edge(0,6);
        Edge e9 = new Edge(4,9);
        Edge e10 = new Edge(2,6);
        Edge e11 = new Edge(6,4);
        Edge e12 = new Edge(10,50);
        Edge e13 = new Edge(5,50);
        Edge e14 = new Edge(2,20);
        Edge e15 = new Edge(1,20);

        Edge e16 = new Edge(30,22);
        Edge e17 = new Edge(30,20);
        Edge e18 = new Edge(45,50);
        Edge e19 = new Edge(42,120);
        Edge e20 = new Edge(111,20);        
        
        g.insertEdge(e1) ;
        g.insertEdge(e2) ;
        g.insertEdge(e3) ;
        g.insertEdge(e4) ;
        g.insertEdge(e5) ;
        g.insertEdge(e6) ;
        g.insertEdge(e7) ;
        g.insertEdge(e8) ;
        g.insertEdge(e9) ;
        g.insertEdge(e10) ;
        g.insertEdge(e11) ;
        g.insertEdge(e12) ;
        g.insertEdge(e13) ;
        g.insertEdge(e14) ;
        g.insertEdge(e15) ;        

        g.insertEdge(e16) ;
        g.insertEdge(e17) ;
        g.insertEdge(e18) ;
        g.insertEdge(e19) ;
        g.insertEdge(e20) ; 
        
        g.showDetails() ;
        g.showEdges() ;
        g.showAdjacencyMatrix() ;
        g.showAdjacencyList() ;
        
        return 0;
        
    }      
   /*
    *  instantiate a Graph object
    *  Try to add some "duplicate" edges -> this should not be possible.
    *
     */
    public static int test3() {
        Graph g = new Graph();
        Edge e1 = new Edge(3,7);
        g.insertEdge(e1) ;

        g.showDetails() ;
        g.showEdges() ;
        g.showAdjacencyMatrix() ;

        Edge e2 = new Edge(3,7);        
        Edge e3 = new Edge(3,7); 
        g.insertEdge(e2) ;
        g.insertEdge(e3) ;
        
        g.showDetails() ;
        g.showEdges() ;
        g.showAdjacencyMatrix() ;  
                
        return 0 ;
    }
    
   /*
    *  instantiate a Graph object
    *  add some Edges to it
    *  display the Graph
    *
     */
    public static int test2() {
        Graph g = new Graph();
        Edge e1 = new Edge(3,7);
        Edge e2 = new Edge(1,8);
        Edge e3 = new Edge(7,8);
        Edge e4 = new Edge(0,5);
        Edge e5 = new Edge(5,2);
        Edge e6 = new Edge(3,8);
        Edge e7 = new Edge(2,9);
        Edge e8 = new Edge(0,6);
        Edge e9 = new Edge(4,9);
        Edge e10 = new Edge(2,6);
        Edge e11 = new Edge(6,4);

        g.insertEdge(e1) ;
        g.insertEdge(e2) ;
        g.insertEdge(e3) ;
        g.insertEdge(e4) ;
        g.insertEdge(e5) ;
        g.insertEdge(e6) ;
        g.insertEdge(e7) ;
        g.insertEdge(e8) ;
        g.insertEdge(e9) ;
        g.insertEdge(e10) ;
        g.insertEdge(e11) ;

        g.showDetails() ;
        g.showEdges() ;
        g.showAdjacencyMatrix() ;
        
        return 0;
        
    }    
    

    /*
    *  instantiate a Graph object
    *  add some Edges to it
    *  display the Graph
    *
     */
    public static int test1() {
        Graph g = new Graph();
        Edge e1 = new Edge(3,7);
        Edge e2 = new Edge(1,4);
        Edge e3 = new Edge(7,8);
        Edge e4 = new Edge(0,5);
        Edge e5 = new Edge(5,2);
        Edge e6 = new Edge(3,8);
        Edge e7 = new Edge(2,9);
        Edge e8 = new Edge(0,6);
        Edge e9 = new Edge(4,9);
        Edge e10 = new Edge(2,6);
        Edge e11 = new Edge(6,4);

        g.insertEdge(e1) ;
        g.insertEdge(e2) ;
        g.insertEdge(e3) ;
        g.insertEdge(e4) ;
        g.insertEdge(e5) ;
        g.insertEdge(e6) ;
        g.insertEdge(e7) ;
        g.insertEdge(e8) ;
        g.insertEdge(e9) ;
        g.insertEdge(e10) ;
        g.insertEdge(e11) ;

        g.showEdges() ;
        
        return 0;
        
    }

}
