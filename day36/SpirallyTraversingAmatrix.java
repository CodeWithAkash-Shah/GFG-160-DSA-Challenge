package day36;

import java.util.ArrayList;

public class SpirallyTraversingAmatrix {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        ArrayList<Integer> ans = new ArrayList<>();
        int rows = mat.length;
        int cols = mat[0].length;

        int topRow = 0, bottomRow = rows - 1;
        int leftCol = 0, rightCol = cols - 1;

        while (topRow <= bottomRow && leftCol <= rightCol) {
            for (int i = leftCol; i <= rightCol; i++) {
                ans.add(mat[topRow][i]);
            }
            topRow++;

            for (int i = topRow; i <= bottomRow; i++) {
                ans.add(mat[i][rightCol]);
            }
            rightCol--;

            if (topRow <= bottomRow) {
                for (int i = rightCol; i >= leftCol; i--) {
                    ans.add(mat[bottomRow][i]);
                }
                bottomRow--;
            }

            if (leftCol <= rightCol) {
                for (int i = bottomRow; i >= topRow; i--) {
                    ans.add(mat[i][leftCol]);
                }
                leftCol++;
            }
        }

        return ans;
    }
}