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
public class AdjMatrix2 implements AdjMatrixI{
    private static ArrayList< String > theMatrix; // :-)
    private static final String ZERO = "0";
    private static final String ONE = "1";

    public AdjMatrix2(Graph g) {
        
        theMatrix = new ArrayList<>();
        int matrixSize = g.getNumberOfVertices();
        // use <= in the 2 outer loops
        // vertex numbering starts at 0, but we need to capture
        // the maximum vertex number, too
        for (int rows = 0; rows <= matrixSize; rows++) {
            String matrixString = "";
            for (int cols = 0; cols <= matrixSize; cols++) {
                boolean hit = false;
                // go through all entries of the Graph's ArrayList
                for (int pos = 0; pos < g.getNumberOfEdges() ; pos++) {
                    String s1 = g.getEdge(pos).getSource().getName() ;
                    String s2 = g.getEdge(pos).getDestination().getName() ;
                    String s3 = g.getEdge(rows).getSource().getName() ;
                    String s4 = g.getEdge(cols).getDestination().getName() ;
                    if ( s1.equals(s3) 
                      && s2.equals(s4) ){
                        hit = true;
                    }
                }
                if (hit) {
                    matrixString = matrixString.concat(ONE);

                } else {
                    matrixString = matrixString.concat(ZERO);
                }
            }
            theMatrix.add(matrixString);
        }

    }

    @Override
    public ArrayList< String> getAdjMatrix() {
        return theMatrix;
    }

    @Override
    public void showAdjMatrix() {
//        for(String s : theMatrix){
//           System.out.println(s);
//        }
        theMatrix.stream().forEach((s) -> {
            System.out.println(s);
        });
    }

    @Override
    public void showAdjList() {
        for (int spos = 0; spos < theMatrix.size() ; spos++) {
            System.out.print(spos + ": ");
            for (int i = 0; i < theMatrix.get(spos).length(); i++) {
                if (theMatrix.get(spos).charAt(i) == '1') 
                    System.out.print(i + "  ");
            }
            System.out.println();
        }
    }   
}
