// Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

// You may assume no duplicates in the array.

// Example 1:

// Input: [1,3,5,6], 5
// Output: 2
// Example 2:

// Input: [1,3,5,6], 2
// Output: 1
// Example 3:

// Input: [1,3,5,6], 7
// Output: 4
// Example 4:

// Input: [1,3,5,6], 0
// Output: 0


class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0, right = nums.length -1 , mid = 0;
        int order = 0;
        
        if(nums.length == 0){
            return -1;
        }
        
        while(left <= right){
            
            mid = right + left / 2;
            
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] > target){
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        
        if(nums[mid] > target){
            order = mid;
        } else if(nums[mid] < target){
            order = mid+1;
        }
        
   return order; }
}