class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        
        // First pass: Calculate prefix products and store in output
        int prefix = 1;
        for (int i = 0; i < nums.length; i++) {
            output[i] = prefix;
            prefix *= nums[i];
        }
        
        // Second pass: Calculate suffix products on the fly and multiply with output
        int postfix = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            output[i] *= postfix;
            postfix *= nums[i];
        }
        
        return output;
    }
}