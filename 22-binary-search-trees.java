public static int getHeight(Node root){
    //Write your code here
    if (root == null) {
        return -1;
    } else {
        return Math.max(getHeight(root.left), getHeight(root.right))+1;
    }
}

