package day37;

public class Rotateby90degree {
    static void rotateby90(int mat[][]) {
        // code here
        int n = mat.length;
    
    // Step 1: Transpose the matrix
    for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
            int temp = mat[i][j];
            mat[i][j] = mat[j][i];
            mat[j][i] = temp;
        }
    }
    
    // Step 2: Reverse each column
    for (int col = 0; col < n; col++) {
        int top = 0, bottom = n - 1;
        while (top < bottom) {
            int temp = mat[top][col];
            mat[top][col] = mat[bottom][col];
            mat[bottom][col] = temp;
            top++;
            bottom--;
        }
    }
    }
}
