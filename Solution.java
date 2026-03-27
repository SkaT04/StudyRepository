package Learnen.SameTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    Queue<TreeNode> queue1 = new LinkedList<>();
    Queue<TreeNode> queue2 = new LinkedList<>();
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }else if(p == null || q == null){
            return false;
        }
        queue1.add(p);
        queue2.add(q);

        while(!(queue1.isEmpty() && queue2.isEmpty())){
            TreeNode current1 = queue1.poll();
            TreeNode current2 = queue2.poll();


            if(current1.val != current2.val) return false;

            if(current1.left == null && current2.left != null ||
                    current1.left != null && current2.left == null) return false;


            if(current1.right == null && current2.right != null ||
                    current1.right != null && current2.right == null) return false;



            if(current1.left != null) queue1.add(current1.left);
            if(current2.left != null) queue2.add(current2.left);

            if(current1.right != null) queue1.add(current1.right);
            if(current2.right != null) queue2.add(current2.right);
        }
        return true;
    }


}

