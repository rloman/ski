package nl.example.app.algorithms.maxconsubseqsum;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MaximumContiguousSubsequenceSumTest {

    @Test
    public void testBasic() {

        int[] array = {-1, 2, 3, 5, -3};

        assertEquals(10, MaximumContiguousSubsequenceSum.maxContiguousSubsequenceSum(array));
        assertEquals(1, MaximumContiguousSubsequenceSum.leftIndex);
        assertEquals(3, MaximumContiguousSubsequenceSum.rightIndex);
    }

    @Test
    public void testRight() {

        int[] array = {-1, 1, -3, 5, 2, -3};

        assertEquals(7, MaximumContiguousSubsequenceSum.maxContiguousSubsequenceSum(array));
        assertEquals(3, MaximumContiguousSubsequenceSum.leftIndex);
        assertEquals(4, MaximumContiguousSubsequenceSum.rightIndex);
    }

    @Test
    public void testLeftSumRight() {

        int[] array = {-1, 1, -3, 5, -1, 2, -3};

        assertEquals(6, MaximumContiguousSubsequenceSum.maxContiguousSubsequenceSum(array));
        assertEquals(3, MaximumContiguousSubsequenceSum.leftIndex);
        assertEquals(5, MaximumContiguousSubsequenceSum.rightIndex);
    }

    @Test
    public void testLeftSumRightMore() {

        int[] array = {-1, 2, -1, 5, -1, 2, -3};

        assertEquals(7, MaximumContiguousSubsequenceSum.maxContiguousSubsequenceSum(array));
        assertEquals(1, MaximumContiguousSubsequenceSum.leftIndex);
        assertEquals(5, MaximumContiguousSubsequenceSum.rightIndex);
    }

    @Test
    public void testLeftSumRightEvenMore() {

        int[] array = {-1, 3, -1, 5, -1, 2, -3};

        assertEquals(8, MaximumContiguousSubsequenceSum.maxContiguousSubsequenceSum(array));
        assertEquals(1, MaximumContiguousSubsequenceSum.leftIndex);
        assertEquals(5, MaximumContiguousSubsequenceSum.rightIndex);
    }
}