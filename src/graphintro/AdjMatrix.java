package graphintro;

import java.util.ArrayList;

/**
 *
 * @author stefan
 */
public class AdjMatrix implements AdjMatrixI {

    private static ArrayList< String > theMatrix; // :-)
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
    public ArrayList< String > getAdjMatrix() {
         return theMatrix;
    }

    @Override
    public void showAdjMatrix() {
        theMatrix.stream().forEach((s) -> {
            System.out.println(s);
        });
    }
}


