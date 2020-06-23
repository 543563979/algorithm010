class PreorderTraversal {
    public List<Integer> preorderTraversal(TreeNode root) {
        List list = new ArrayList();
        return helper(root,list);
    }

    private List<Integer> helper(TreeNode root , List list){
        if (root == null){
            return list;
        }
        list.add(root.val);
        helper(root.left,list);
        helper(root.right,list);
        return list;
    }
}