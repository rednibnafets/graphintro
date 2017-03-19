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

    public Graph showEdges() {
        System.out.println("-- Edges ------------------------------------------");
        for (Edge e : graph) {
            System.out.println(e.toString());
        }
        System.out.println("--------------------------------------------------");        
        return this;
    }
}
