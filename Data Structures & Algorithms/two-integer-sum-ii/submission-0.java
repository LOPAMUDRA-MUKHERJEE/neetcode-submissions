class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                // The problem requires 1-indexed output
                return new int[] {left + 1, right + 1};
            } else if (currentSum < target) {
                left++; // We need a larger sum, so move the left pointer up
            } else {
                right--; // We need a smaller sum, so move the right pointer down
            }
        }
        
        return new int[0]; // Fallback, though the problem guarantees exactly one solution
    }
}