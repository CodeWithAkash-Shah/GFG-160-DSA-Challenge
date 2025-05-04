package day41;

public class SetMatrixZeroes {
    public void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;
    boolean firstRowHasZero = false, firstColHasZero = false;

    // Step 1: Check first row and column
    for (int i = 0; i < n; i++) {
        if (mat[i][0] == 0) {
            firstColHasZero = true;
            break;
        }
    }
    for (int j = 0; j < m; j++) {
        if (mat[0][j] == 0) {
            firstRowHasZero = true;
            break;
        }
    }

    // Step 2: Use first row and column as markers
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            if (mat[i][j] == 0) {
                mat[i][0] = 0;
                mat[0][j] = 0;
            }
        }
    }

    // Step 3: Set zeroes based on markers
    for (int i = 1; i < n; i++) {
        for (int j = 1; j < m; j++) {
            if (mat[i][0] == 0 || mat[0][j] == 0) {
                mat[i][j] = 0;
            }
        }
    }

    // Step 4: Update first row if needed
    if (firstRowHasZero) {
        for (int j = 0; j < m; j++) {
            mat[0][j] = 0;
        }
    }

    // Step 5: Update first column if needed
    if (firstColHasZero) {
        for (int i = 0; i < n; i++) {
            mat[i][0] = 0;
        }
    }
    }
}
