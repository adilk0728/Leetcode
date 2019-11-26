// Given two binary trees, write a function to check if they are the same or not.

// Two binary trees are considered the same if they are structurally identical and the nodes have the same value.

// Example 1:

// Input:     1         1
//           / \       / \
//          2   3     2   3

//         [1,2,3],   [1,2,3]

// Output: true
// Example 2:

// Input:     1         1
//           /           \
//          2             2

//         [1,2],     [1,null,2]

// Output: false
// Example 3:

// Input:     1         1
//           / \       / \
//          2   1     1   2

//         [1,2,1],   [1,1,2]

// Output: false

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        
       if(p == null && q == null){
           return true;
       }
        
        if((p != null && q ==null) || (p == null && q != null)){
            return false;
        }
        
        if((Math.abs(heightP(p.left) - heightP(p.right)) != Math.abs(heightQ(q.left) - heightQ(q.right))) || (p.val != q.val)){
            return false;
        }
        
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    
    
    public int heightP(TreeNode p){
        
        if(p == null){
            return 0;
        }
        
        int pLeft = heightP(p.left);
        int pRight = heightP(p.right);
        
        return 1+ Math.max(pLeft, pRight);
    }
    
    public int heightQ(TreeNode q){
        
        if(q == null){
            return 0;
        }
        
        int qLeft = heightQ(q.left);
        int qRight = heightQ(q.right);
        
        return 1+ Math.max(qLeft, qRight);
    }
}