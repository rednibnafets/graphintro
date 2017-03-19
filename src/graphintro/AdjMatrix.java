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
public class AdjMatrix implements AdjMatrixI {

    private ArrayList< String> theMatrix; // :-)
    //private Graph theGraph;

    private static final String zero_ = "0";
    private static final String one_ = "1";

    public AdjMatrix(Graph g) {
        theMatrix = new ArrayList<>();
        int matrixSize = g.getNumberOfEdges();

        for (int rows = 0; rows < matrixSize; rows++) {
            String matrixString = "";
            for (int cols = 0; cols < matrixSize; cols++) {
                boolean hit = false;
                for (int pos = 0; pos < matrixSize; pos++) {
                    if (g.getEdge(pos).getV1() == rows
                            && g.getEdge(pos).getV2() == cols) {
                        hit = true;
                    }
                }
                if (hit) {
                    matrixString = matrixString.concat(one_);

                } else {
                    matrixString = matrixString.concat(zero_);
                }
            }
            theMatrix.add(matrixString);
        }

    }

    @Override
    public ArrayList< String> getAdjMatrix() {
        return this.theMatrix;
    }

    @Override
    public void showAdjMatrix() {
        for (String s : theMatrix) {
            System.out.println(s);
        }
    }

}
