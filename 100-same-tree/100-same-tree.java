/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public static void preorder(TreeNode n, ArrayList<Integer> arr){
        if(n != null){
            arr.add(n.val);
            preorder(n.left, arr);
            preorder(n.right, arr);
        }
        else{
            arr.add(null);
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList <Integer> arr1 = new ArrayList<>();
        ArrayList <Integer> arr2 = new ArrayList<>();
        preorder(p , arr1);
        preorder(q , arr2);
        if(arr1.equals(arr2) == true)
            return true;
        return false;
    }
}