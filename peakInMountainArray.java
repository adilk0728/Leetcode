// A.length >= 3
// There exists some 0 < i < A.length - 1 such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
// Given an array that is definitely a mountain, return any i such that A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1].

// Example 1:

// Input: [0,1,0]
// Output: 1
// Example 2:

// Input: [0,2,1,0]
// Output: 1

class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int max=0;
       for(int i=1;i<A.length;i++){
           if(A[i]>A[max]){
              max=i;
       }
    }
        return max;
       }
}
