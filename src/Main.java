public final class Main {
    public static void main(final String[] args) {
        final int[][] matrixA = {
                {1, 2, 3},
                {4, 5, 6}
        };
        final int[][] matrixB = {
                {7, 8},
                {9, 10},
                {11, 12}
        };
        final int[][] result = Matrix.multiply(matrixA, matrixB);
        System.err.println("Result: ");
        Matrix.printMatrix(result);
    }
}