import java.util.Scanner;

public class SaddlePoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows and columns:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        
        int[][] matrix = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        sc.close();

        for (int i = 0; i < matrix.length; i++) {
            int rowMin = matrix[i][0];
            int colIndex = 0;

            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < rowMin) {
                    rowMin = matrix[i][j];
                    colIndex = j;
                }
            }

            boolean flag = true;
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][colIndex] > rowMin) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                System.out.println("Saddle Point found: " + rowMin + " at (" + i + ", " + colIndex + ")");
                return;
            }
        }

        System.out.println("No Saddle Point found.");
    }
}
