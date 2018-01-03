public class Arrays {
    
    public static int[][] m= new int[][]{{0}, {0, 1}, {0, 2, 4}, {0, 3, 6, 9}};
    
    /** Return a triangular array m (say) with n rows in which
      * each m[i][j], for 0 <= i <= j < n, contains i*j */
    public static int[][] multTable(int n) {
        int[][] m= new int[n][];
        
        for (int i= 0; i < n; i= i+1) {
            // Create an populate row m[i]
            m[i]= new int[i+1];
            for (int j= 0; j <= i; j= j+1) {
                m[i][j]= i*j;
            }
        }
        
        return m;
    }
}