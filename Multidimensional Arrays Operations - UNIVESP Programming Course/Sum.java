public class Sum {
    public static void main(String[] args) {
        double[][] matrix1 = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        double[][] matrix2 = {
                {10, 20, 30, 40},
                {50, 60, 70, 80},
                {90, 100, 110, 120}
        };

        // The sum matrix must have the same number of rows and columns as 'matrix1' and 'matrix2'
        double[][] sumInterm = new double[matrix1.length][matrix1[0].length];

        boolean checker = verifications(matrix1, matrix2);

        // Condition check for summing
        if (checker) {
            matricesSum(matrix1, matrix2, sumInterm);
            printMatrix(matrix1, sumInterm);
        } else
            System.out.println("Matrices cannot be summed, " +
                    "because they do not have the same number of rows and columns");
    }

    /**
     * Method that checks whether the number of rows and columns in the matrices is the same
     * @param matrix1
     * @param matrix2
     * @return true ou false
     */
    private static boolean verifications(double[][] matrix1, double[][] matrix2) {
        // Check number of lines
        boolean linesNumber = matrix1.length == matrix2.length;

        // Check number of columns
        boolean columns = false;
        for (int i = 0; i < matrix1.length; i++){
            columns = matrix1[i].length == matrix2[i].length;
            if(!columns) break;
        }

        // Checking both
        if (linesNumber && columns) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Method that performs the sum of matrices
     * @param matrix1
     * @param matrix2
     * @param sumInterm
     */
    private static void matricesSum(double[][] matrix1, double[][] matrix2, double[][] sumInterm) {
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++){
                sumInterm[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
    }

    /**
     * Method that prints the resulting matrix
     * @param matrix1
     * @param sumInterm
     */
    private static void printMatrix(double[][] matrix1, double[][] sumInterm) {
        for (int i = 0; i < matrix1.length; i++){
            for (int j = 0; j < matrix1[0].length; j++)
                System.out.print(sumInterm[i][j] + " ");
            System.out.println();
        }
    }
}
