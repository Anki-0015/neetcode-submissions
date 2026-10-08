class Solution {
    public int maxArea(int[] heights) {

        // int ans = 0;
        
        // for(int i = 0; i < heights.length; i++){
        //     for(int j = i + 1;  j < heights.length; j++){
        //         ans = Math.max(ans, Math.min(heights[i], heights[j]) * (j - i));
        //     }
        // }
        // return ans;    




        int l = 0;
        int r = heights.length - 1;
        int ans = 0;

        while (l < r) {
            int area = Math.min(heights[l], heights[r]) * (r - l);
            ans = Math.max(ans, area);
            if (heights[l] <= heights[r]) {
                l++;
            } 
            else {
                r--;
            }
        }
        return ans;
    }
}
