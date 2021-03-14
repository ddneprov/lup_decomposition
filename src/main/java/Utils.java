

public class Utils {

    private static final String EMPTY = " ";

    public static void writeMatrix(double[][] matrix){
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if(matrix[i][j] % 1 ==0)
                    System.out.print((int)matrix[i][j] + EMPTY);
                else
                    System.out.print(matrix[i][j] + EMPTY);
            }
            System.out.println();
        }
    }

    public static double[][] createIdentetyMatrix(int N){
        double [][] a = new double[N][N];
            for (int i = 0; i < N; i++){
                for (int j = 0; j < N; j++){
                    if (i != j)
                        a[i][j] = 0;
                    else
                        a[i][j] = 1;
                }
            }
            return a;
    }
}
