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






        // if(nums.length == 0) return 0;

        // Arrays.sort(nums);

        // int count = 1;
        // int max = 1;

        // for(int i = 1; i < nums.length; i++){
        //     if(nums[i] == nums[i-1]){
        //         continue;
        //     }
        //     if(nums[i] == nums[i-1] + 1){
        //         count++;
        //     }
        //     else{
        //         count = 1;
        //     }
        //     max = Math.max(max, count);
        // }
        // return max;





        int ans = 0;

        Set<Integer> set = new HashSet<>();

        for(int i : nums){
            set.add(i);
        }

        for(int i : set){
            if(!set.contains(i - 1)){
                int count = 1;

                while(set.contains(count + i)){
                    count++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;


        

    }
    // public boolean contains(int[] nums, int a){
    //     for(int i : nums){
    //         if(i == a)return true;
    //     }
    //     return false;
    // }
}
