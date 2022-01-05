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
2. Visit right subtree
3. Visit root
**/
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        return traverse(root, new ArrayList<Integer>());
    }
    
    public static List<Integer> traverse(TreeNode root, ArrayList<Integer> list){
        if(root == null)
            return list;
        
        traverse(root.left, list);
        traverse(root.right, list);
        list.add(root.val);
        
        return list;
    }
}

/**
Tree: https://www.geeksforgeeks.org/tree-traversals-inorder-preorder-and-postorder/

Root:  2 <-- 1 --> 3
Left subtree: 4 <-- 2 --> 5

list = [4, 5, 2, 3, 1]
Step-by-step callstack:

pop off traverse(1)
list.add(1)
pop off traverse(3)
list.add(3)
traverse(null right) --> pop off null
traverse(null left) --> pop off null
traverse(3) --> this is from node 1's right value

pop off traverse(2)
list.add(2)
pop off traverse(5)
list.add(5)
traverse(null right) --> pop off null
traverse(null left) --> pop off null
traverse(5) --> this is from node 2's right value

pop off traverse(4)
list.add(4)
traverse(null right) --> pop off null
traverse(null left) --> pop off null

traverse(4)
traverse(2)
traverse(1)
**/