package LeetCode.LeetCode34;

public class Solution {

    /*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.



Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]


Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109
nums is a non-decreasing array.
-109 <= target <= 109

     */

    //////////////////////////////////////////////

    /*
    Runtime = 0ms
     */
    public int[] searchRange(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        int [] res = new int []{-1, -1};

        while (l <= r){
            int mid = l + (r - l) / 2;
            if (nums[mid] == target){
                int tmp = mid;
                while (tmp >= 0 && nums[tmp] == target){
                    res[0] = tmp;
                    tmp--;
                }
                tmp = mid;
                while (tmp < nums.length && nums[tmp] == target){
                    res[1] = tmp;
                    tmp++;
                }
                break;
            }
            else if (nums[mid] > target){
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }

        return res;
    }
}
