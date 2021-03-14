
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UtilsTest {

    @Test
    public void test2() {
        double[][] A = {
                {1, 0},
                {0, 1}
        };
        assertMatrixEquals(A, Utils.createIdentetyMatrix(2));
    }

    void assertMatrixEquals(double[][] first, double[][] second) {
        for (int i = 0; i < first.length; i++) {
            Assertions.assertArrayEquals(first[i], second[i]);
        }
    }
}