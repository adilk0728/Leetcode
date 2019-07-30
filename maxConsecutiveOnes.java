// Given a binary array, find the maximum number of consecutive 1s in this array.

// Example 1:
// Input: [1,1,0,1,1,1]
// Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s.
//     The maximum number of consecutive 1s is 3.




class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int countOnes = 0, result = 0;
        for(int var : nums){
            if(var==1){
                countOnes++;
                result = Math.max(countOnes, result);
            }
         else {
            countOnes = 0;
        }
    }
    return result;}
}