import java.util.ArrayList;
import java.util.List;

/**
 * Created by liudan on 2020/3/10.
 */
public class Solution4 {





    public TreeNode diameterOfBinaryTree(TreeNode root,TreeNode p,TreeNode q) {


        List<TreeNode> leftList = new ArrayList<>();
        List<TreeNode> rightList = new ArrayList<>();

        dept(root,p,leftList);
        dept(root,q,rightList);
        TreeNode node = null;
        for (TreeNode ele:leftList) {
            if (rightList.contains(ele)) {
                node = ele;
                break;
            }
        }

        return node;

    }

    public int dept(TreeNode node,TreeNode target,List<TreeNode> list){


        if(node.val == target.val) {
            list.add(node);
            return 1;
        }else {
            int left =  dept(node.left,target,list);
            int right =  dept(node.right,target,list);
            if (left > 0 || right >0) {
                list.add(node);
                return 1;
            }else{
                return 0;
            }


        }



    }


    class TreeNode {
             int val;
             TreeNode left;
             TreeNode right;
             TreeNode(int x) { val = x; }
         }
}
