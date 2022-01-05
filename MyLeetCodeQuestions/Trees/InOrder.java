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
1. Visit left subtree
2. visit root
3. visit right subtree
**/
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<Integer>());
    }
    
    public static List<Integer> traverse(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return list;
        
        TreeNode temp = root;
        
        traverse(temp.left, list);
        list.add(temp.val);
        traverse(temp.right, list);        
        
        return list;
    }
}

/**
Visualizer: https://www.youtube.com/watch?v=4_UDUj1j1KQ

Example:

Tree: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/
Root:  2 <-- 1 --> 3
Left subtree: 4 <-- 2 --> 5

list = [4, 2, 5, 1, 3]

Step-by-step callstack:

Done
pop off traverse(1)

traverse(null right) --> pop off null call
list.add(3)
traverse(null left) --> pop off null call

traverse(3)
list.add(1)

pop off traverse(2)
pop off traverse(5)
traverse(null right) --> pop off null call
list.add(5)
traverse(null left) --> pop off null call
traverse(5)
list.add(2)

pop off traverse(4)
traverse(null right) --> pop off null call
list.add(4)
traverse(null left) --> pop off null call

traverse(4)
traverse(2)
traverse(1)
**/