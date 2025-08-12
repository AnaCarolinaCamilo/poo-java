public class Determinant {
  public static int det(int[][] matrix) {
    int n = matrix.length;

    // base case: 2x2
    if (n == 2) {
      return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
    }

    int det = 0;
    // each col
    for (int i = 0; i < n; i++) {
      // laplace
      int s = (i % 2 == 0) ? 1 : -1;

      // then we remove one col and one row (cause it's squared)
      int[][] subMatrix = new int[n - 1][n - 1];

      // for each row
      // start at 1 cause we are going to remove 1
      for (int j = 1; j < n; j++) {
        int subIndex = 0;

        // then we run throught the original matrix columns to
        // populate the new matrix
        for (int m = 0; m < n; m++) {
          // we jump the current line expansion
          if (m == i)
            continue;

          // then we do it for each row
          subMatrix[j - 1][subIndex++] = matrix[j][m];
        }
      }

      // then we call the det for the next col * the det for
      // choped matrix
      det += s * matrix[0][i] * det(subMatrix);
    }

    return det;
  }

  public static void main(String[] args) {
    int[][] matrix = {
        { 1, 2, 0, 0, 0 },
        { 4, -1, 0, 0, 0 },
        { 0, 0, 3, 0, 0 },
        { 0, 0, 0, 5, 2 },
        { 0, 0, 0, 2, 1 },
    };

    System.out.println("Determinant: " + det(matrix));

    int[][] matrix2 = {
        { 4, 5, -3, 0 },
        { 2, -1, 3, 1 },
        { 1, -3, 2, 1 },
        { 0, 2, -2, 5 },
    };

    System.out.println("Determinant: " + det(matrix2));
  }
}