/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
            int[] arr= new int[2];
            int low=0;
            int high=nums.length;
            while(low<high){
                int mid=(low+high)/2;
                if(mid==target){
                    arr[0]=mid;
                }
                if(mid<target)
            }
    }
}
// @lc code=end

