public final class Matrix {
    public static int[][] multiply(final int[][] matrixA,
                                   final int[][] matrixB
    ) {
        if (matrixA[0].length != matrixB.length) {
            System.err.println("This matrix cannot be multiply");
        }
        final int[][] matrixM = new int[matrixA.length][matrixB[0].length];
        for (int i = 0; i < matrixM.length; i++) {
            for (int j = 0; j < matrixM[0].length; j++) {
                matrixM[i][j] = 0;
                for (int k = 0; k < matrixA[0].length; k++) {
                    matrixM[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        return matrixM;
    }
    public static void printMatrix(final int[][] matrix) {
        for (final int[] row : matrix) {
            for (final int value : row) {
                System.err.print(value + " ");
            }
            System.err.println();
        }
    }
}
