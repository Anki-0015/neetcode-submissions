class Solution {
    public int longestConsecutive(int[] nums) {

        // int max = 0;

        // for(int i : nums){

        //     int count = 1;
        //     int a = i + 1;

        //     while(contains(nums, a)){
        //         count++;
        //         a++;
        //     }

        //     max = Math.max(max, count);
        // }
        // return max;

        if(nums.length == 0) return 0;

        Arrays.sort(nums);

        int count = 1;
        int max = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i-1]){
                continue;
            }
            if(nums[i] == nums[i-1] + 1){
                count++;
            }
            else{
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;
    }
    // public boolean contains(int[] nums, int a){
    //     for(int i : nums){
    //         if(i == a)return true;
    //     }
    //     return false;
    // }
}
