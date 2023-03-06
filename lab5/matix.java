public class matix{
  
    public static void main(String[] args) {
      int[][] matrixA = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
      int[][] matrixB = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};
      
      int[][] sum = addMatrix(matrixA, matrixB);
      int[][] product = multiplyMatrix(matrixA, matrixB);
      
      System.out.println("Matrix A: ");
      printMatrix(matrixA);
      System.out.println("Matrix B: ");
      printMatrix(matrixB);
      System.out.println("Sum of A and B: ");
      printMatrix(sum);
      System.out.println("Product of A and B: ");
      printMatrix(product);
    } 
    
    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
      int[][] sum = new int[matrixA.length][matrixA[0].length];
      
      for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixA[0].length; j++) {
          sum[i][j] = matrixA[i][j] + matrixB[i][j];
        }
      }
      
      return sum;
    }
    
    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
      int[][] product = new int[matrixA.length][matrixB[0].length];
      
      for (int i = 0; i < matrixA.length; i++) {
        for (int j = 0; j < matrixB[0].length; j++) {
          for (int k = 0; k < matrixB.length; k++) {
            product[i][j] += matrixA[i][k] * matrixB[k][j];
          }
        }
      }
      
      return product;
    }
    
    public static void printMatrix(int[][] matrix) {
      for (int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
          System.out.print(matrix[i][j] + " ");
        }
        System.out.println();
      }
    }
  }
  