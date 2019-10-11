/*
 * @lc app=leetcode id=1 lang=java
 *
 * [1] Two Sum
 */

// @lc code=start
// Optimization to O(n)
// we need to return arr of indices
// use two pointer concept
/*class Solution{
    public int[] twoSum(int[] nms,int target){
        int sum=0;
        int p1=0,p2=1,i=0;
        int[] arr=new int[2];
        while(i<nms.length){
            
            i++;
        }
        return arr; 
    }
}*/
/* Brute force approach*/
class Solution {
    public int[] twoSum(int[] nms, int target) {
        int sum = 0;
        int[] arr = new int[2];
        for (int i = 0; i < nms.length; i++) {
            for (int j = i + 1; j < nms.length; j++) {
                sum = nms[i] + nms[j];
                if (sum == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
                sum = 0;

            }
        }
        return arr;
    }
}
// @lc code=end
