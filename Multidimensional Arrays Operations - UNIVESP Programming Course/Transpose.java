public class Transpose {
    public static void main(String[] args) {
        double[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        double[][] transposition = new double[matrix1[0].length][matrix1.length];

        transpositionOperation(matrix1, transposition);

        printMatrix(transposition);
    }

    private static void transpositionOperation(double[][] matrix1, double[][] transposition) {
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                transposition[j][i] = matrix1[i][j];
            }
        }
    }

    private static void printMatrix(double[][] transposition) {
        for (int i = 0; i < transposition.length; i++){
            for (int j = 0; j < transposition[0].length; j++)
                System.out.print(transposition[i][j] + "\t");
            System.out.println();
        }
    }
}
