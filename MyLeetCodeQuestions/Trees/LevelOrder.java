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
    
    /* queue = [15, 7] , size = 2
    currentLevel = [9, 20]
    list = [[3], [9, 20]] */
    
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if(root == null)
            return list;
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for(int i = 0; i < size; i++){
                TreeNode current = queue.remove();
                currentLevel.add(current.val);
                
                if(current.left != null)
                    queue.add(current.left);
                
                if(current.right != null)
                    queue.add(current.right);
                
                
            }
            list.add(currentLevel);
        }
        return list;
    }
}
