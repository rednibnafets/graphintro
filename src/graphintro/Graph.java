/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphintro;

import java.util.ArrayList;

/**
 *
 * @author stefan
 */
public class Graph {

    private ArrayList< Edge> graph;

    public Graph() {
        graph = new ArrayList<>();
    }
    
    public Graph insertEdge(Edge e){
        graph.add(e) ;
        return this;
    }

    public int getNumberOfEdges(){
        return graph.size() ;
    }
    
    public Edge getEdge(int position){
        return graph.get(position) ;
    }
    
    public Graph showEdges() {
        System.out.println("-- Edges ------------------------------------------");
        for (Edge e : graph) {
            System.out.println(e.toString());
        }
        System.out.println("--------------------------------------------------");        
        return this;
    }

    public Graph showAdjacencyMatrix(){
        System.out.println("-- Adjacency Matrix ------------------------------");            
        AdjMatrixI ami = new AdjMatrix(this) ;
        ami.showAdjMatrix() ;
        System.out.println("--------------------------------------------------");     
        return this;
    }

}
