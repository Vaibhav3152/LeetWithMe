class Solution {
    public int fib(int n) {
        if (n <= 0) return 0;
        
        int[][] T = {{1, 1}, {1, 0}};
        power(T, n - 1);
        
        return T[0][0];
    }
    private static void power(int[][] T, int n) {
        if (n == 0 || n == 1) return;
        int[][] M = {{1, 1}, {1, 0}};
        
        power(T, n / 2);
        multiply(T, T);
        
        if (n % 2 != 0) {
            multiply(T, M);
        }
    }

    private static void multiply(int[][] A, int[][] B) {
        int x = A[0][0] * B[0][0] + A[0][1] * B[1][0];
        int y = A[0][0] * B[0][1] + A[0][1] * B[1][1];
        int z = A[1][0] * B[0][0] + A[1][1] * B[1][0];
        int w = A[1][0] * B[0][1] + A[1][1] * B[1][1];
        
        A[0][0] = x;
        A[0][1] = y;
        A[1][0] = z;
        A[1][1] = w;
    }
}