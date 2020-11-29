package nl.example.app.algorithms.maxconsubseqsum;

public final class MaximumContiguousSubsequenceSum {

    // might refactor later to a parameter or one big object, it is to dance, not to ride ... :-)
    static int leftIndex;
    static int rightIndex;


    public static int maxContiguousSubsequenceSum(int[] numbers) {
        return maxContiguousSubsequenceSum(numbers, numbers.length);
    }

    private static int maxContiguousSubsequenceSum(int[] numbers, int length) {
        return length > 0 ? maxContiguousSubsequenceSumRecursive(numbers, 0, length-1) : 0;
    }

    private static int maxContiguousSubsequenceSumRecursive(int[] A, int left, int right) {

        int maxLeftBorderSum = 0, maxRightBorderSum = 0;
        int leftBorderSum = 0, rightBorderSum = 0;

        int center = (left + right) / 2;

        // simplest case
        if (left == right) {
            leftIndex = left;
            return A[left] > 0 ? A[left] : 0;
        }

        // recursive left
        int maxLeftSum = maxContiguousSubsequenceSumRecursive(A, left, center);

        // recursive right
        int maxRightSum = maxContiguousSubsequenceSumRecursive(A, center + 1, right);


        // might be applicable to add left and right sum when that sum is bigger than a left or a right solution

        // left
        for (int i = center; i >= left; i--) {
            leftBorderSum += A[i];
            if (leftBorderSum > maxLeftBorderSum) {
                maxLeftBorderSum = leftBorderSum;
                leftIndex = i;
            }
        }

        // right
        for (int i = center + 1; i <= right; i++) {
            rightBorderSum += A[i];
            if (rightBorderSum > maxRightBorderSum) {
                maxRightBorderSum = rightBorderSum;
                rightIndex = i;
            }
        }

        return Math.max(maxLeftBorderSum + maxRightBorderSum, Math.max(maxLeftSum, maxRightSum));
    }
}