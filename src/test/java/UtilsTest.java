import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UtilsTest {

    @Test
    public void test3x3() {
        double[][] A = {
                {1, 0, 0},
                {0, 1, 0},
                {0, 0, 1}
        };
        assertMatrixEquals(A, Utils.createIdentetyMatrix(3));
    }

    @Test
    public void test5x5() {
        double[][] A = {
                {1, 0, 0, 0, 0},
                {0, 1, 0, 0, 0},
                {0, 0, 1, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 1}
        };
        assertMatrixEquals(A, Utils.createIdentetyMatrix(5));
    }

    @Test
    public void testDecompositionLU(){
        double[][] A = {{2, 7, 6, 2}, {9, 5, 1, 3}, {4, 3, 8, 4}, {5, 6, 7, 8}};
        double [][] result = {{9, 5 ,1 ,3},
                {0.2222222222222222,5.888888888888889, 5.777777777777778, 1.3333333333333335},
                {0.4444444444444444,0.13207547169811318, 6.7924528301886795, 2.4905660377358494},
                {0.5555555555555556, 0.5471698113207547, 0.48333333333333334, 4.3999999999999995}};
        assertMatrixEquals(Main.LUP_decomp(A,false), result);
    }

    @Test
    public void testDecompositionP(){
        double[][] A = {{2, 7, 6, 2}, {9, 5, 1, 3}, {4, 3, 8, 4}, {5, 6, 7, 8}};
        double [][] result = {{0, 1 ,0 ,0}, {1, 0 ,0 ,0}, {0, 0 , 1, 0}, {0, 0 ,0 ,1}};
        assertMatrixEquals(Main.LUP_decomp(A,true), result);
    }

    void assertMatrixEquals(double[][] first, double[][] second) {
        for (int i = 0; i < first.length; i++) {
            Assertions.assertArrayEquals(first[i], second[i]);
        }
    }
}
