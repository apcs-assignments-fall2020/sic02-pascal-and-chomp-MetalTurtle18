/**
 * Write a description of class Pascal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pascal {

    private static int nCr(int n, int r) {
        if (n == 0 && r != 0) return 0;
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    private static int factorial(int n) {
        int total = 1;
        for (int i = 2; i <= n; i++) total *= i;
        return total;
    }
    public static int[][] pascalTriangle(int n) {
        int[][] triangle = new int[n][n];
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length; j++) {
                triangle[i][j] = nCr(i, j);
            }
        }
        return triangle;
    }
}
