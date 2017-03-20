/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphintro;

/**
 *
 * @author stefan
 */
public class Vertex {

    private String vName;

    public Vertex(String aName) {
        vName = aName ;
    }

    public String getName() {
        return vName;
    }

    public String setName(String newName) {
        vName = newName;
        return vName;
    }

}
