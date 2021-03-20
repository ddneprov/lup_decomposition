
public class Main {

    public static void main(String[] args) {
        double[][] A = {{2, 7, 6, 2}, {9, 5, 1, 3}, {4, 3, 8, 4}, {5, 6, 7, 8}};
        LUP_decomp(A, false);
    }

    public static double[][] LUP_decomp(double[][] A, boolean isReturnP) {
        int N = A.length;
        double[][] P = Utils.createIdentetyMatrix(N);
        int exchanges = 0;

        for (int i = 0; i < N; i++) {
            int row = Integer.MIN_VALUE;
            double Umax = 0;
            for (int r = i; r < N; r++) {
                double Uii = A[r][i];
                int q = 0;
                while (q < i) {
                    Uii -= A[r][q] * A[q][r];
                    q++;
                }
                if (Math.abs(Uii) > Umax) {
                    Umax = Math.abs(Uii);
                    row = r;
                }
            }

            if (i != row) {
                exchanges = exchanges + 1;
                for (int q = 0; q < N; q++) {
                    double tmp = P[i][q];
                    P[i][q] = P[row][q];
                    P[row][q] = tmp;
                    tmp = A[i][q];
                    A[i][q] = A[row][q];
                    A[row][q] = tmp;
                }
            }
            Utils.determine(A,N,i);
        }
        outputResults(P, A);
        return isReturnP ? P : A;
    }

    private static void outputResults(double [][] P, double [][] A){
        System.out.println("P: ");
        Utils.writeMatrix(P);
        System.out.println("LU: ");
        Utils.writeMatrix(A);
    }
}
