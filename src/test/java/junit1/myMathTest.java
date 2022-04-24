package junit1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class myMathTest {

    myMath myMath = new myMath();

    @Test
    void sum_with3Number() {
        assertEquals(6, myMath.sum(new int[]{1,2,3}));
    }

    @Test
    void sum_with1Number() {
        assertEquals(8, myMath.sum(new int[]{8}));
    }
}