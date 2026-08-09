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
    public List<Integer> largestValues(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        if(root==null){
            return list;
        }
        q.offer(root);
        list.add(root.val);
        while(!q.isEmpty()){
            int size=q.size();
            int max=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                TreeNode node = q.poll();
                if(node.left!=null){
                    q.offer(node.left);
                    max=Math.max(max,node.left.val);
                }
                if(node.right!=null){
                    q.offer(node.right);
                    max=Math.max(max,node.right.val);
                }
            }
            if(!q.isEmpty()){
            list.add(max);
            }
        }
        return list;
    }
}