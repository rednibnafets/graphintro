package graphintro;

import java.util.ArrayList;

/**
 *
 * @author stefan
 *
 * Adjacency matrix implemented as ArrayList< String >
 * "0" represents NO connection between vertices "1" represents edges between
 * vertices
 *
 */
public class AdjMatrix implements AdjMatrixI {

    private static ArrayList< String> theMatrix; // :-)
    private static final String ZERO = "0";
    private static final String ONE = "1";

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
