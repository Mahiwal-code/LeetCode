class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE;
        int current_max = 0;
        for(int i = 0; i < nums.length; i++){
            current_max = current_max + nums[i];

            if(current_max > max_sum ){
                max_sum = current_max;
            }
            if(current_max < 0){
                current_max =0;
            }

        }
        return max_sum;
        
    }
}