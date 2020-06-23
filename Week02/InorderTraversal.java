 // 递归
class InorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        return helper(root,list);
    }

    private List helper(TreeNode root, ArrayList<Integer> list) {
        if(root == null){
            return list;
        }
        if(root.left != null){
            helper(root.left,list);
        }
        list.add(root.val);
        if(root.right !=null){
            helper(root.right,list);
        }
        return list;
    }
}