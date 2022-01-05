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
/**
Steps:
1. Visit the root
2. Visit the left subtree
3. visit right subtree
*/
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<Integer>());
        
    }
    
    public static List<Integer> traverse(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return list;
        
        list.add(root.val);
        
        traverse(root.left, list);
        traverse(root.right, list);
        
        return list;
    }
}