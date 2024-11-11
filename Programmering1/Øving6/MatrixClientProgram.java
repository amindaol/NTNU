import java.util.Scanner;

public class MatrixClientProgram {
    public static void main(String[] args) throws Exception {

        int[][] data1 = {
                {1, 2},
                {3, 4}
        };
        int[][] data2 = {
                {5, 6},
                {7, 8}
        };

        Matrix matrix1 = new Matrix(data1);
        Matrix matrix2 = new Matrix(data2);

        System.out.println("Matrix 1:");
        printMatrixElements(matrix1);

        System.out.println("\nMatrix 2:");
        printMatrixElements(matrix2);

        Matrix added = matrix1.add(matrix2);
        System.out.println("\nMatrix 1 + Matrix 2:");
        if (added != null) {
            printMatrixElements(added);
        } else {
            System.out.println("Addisjon ikke mulig.");
        }

        Matrix multiplied = matrix1.multiply(matrix2);
        System.out.println("\nMatrix 1 * Matrix 2:");
        if (multiplied != null) {
            printMatrixElements(multiplied);
        } else {
            System.out.println("Multiplikasjon ikke mulig.");
        }

        Matrix transposed = matrix1.transpose();
        System.out.println("\nMatrise 1 transponert:");
        printMatrixElements(transposed);
    }

    private static void printMatrixElements(Matrix matrix) {
        int[][] elements = matrix.getElements();
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[i].length; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }

    }

