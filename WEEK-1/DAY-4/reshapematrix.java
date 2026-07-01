package LEETCODE;

class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;
        int n = mat[0].length;

        if (m * n != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int newRow = 0;
        int newCol = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                result[newRow][newCol] = mat[i][j];
                newCol++;

                if (newCol == c) {
                    newCol = 0;
                    newRow++;
                }
            }
        }

        return result;
    }
}






// public class reshapematrix {

//     public static int[][] matrixReshape(int[][] mat, int r, int c) {

//         int m = mat.length;
//         int n = mat[0].length;

//         if (m * n != r * c) {
//             return mat;
//         }

//         int[][] result = new int[r][c];

//         int newRow = 0;
//         int newCol = 0;

//         for (int i = 0; i < m; i++) {
//             for (int j = 0; j < n; j++) {

//                 result[newRow][newCol] = mat[i][j];
//                 newCol++;

//                 if (newCol == c) {
//                     newCol = 0;
//                     newRow++;
//                 }
//             }
//         }

//         return result;
//     }

//     public static void main(String[] args) {

//         int[][] mat = {
//                 {1, 2},
//                 {3, 4}
//         };

//         int r = 1;
//         int c = 4;

//         int[][] result = matrixReshape(mat, r, c);

//         System.out.println("Reshaped Matrix:");

//         for (int i = 0; i < result.length; i++) {
//             for (int j = 0; j < result[0].length; j++) {
//                 System.out.print(result[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }