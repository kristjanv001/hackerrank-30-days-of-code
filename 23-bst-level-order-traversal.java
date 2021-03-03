	static void levelOrder(Node root){
        //Write your code here
    
        // we can use the LinkedList class as out que data str
        // it doesn't matter which end we use as the start/end of the queue
        LinkedList<Node> queue = new LinkedList<>();
    
        if (root != null) {
            queue.add(root);
        }
        
        // as long as there's nodes in our queue
        while (queue.size() > 0) {
            // set current node to whatever we removed from the beginning of the queue
            Node currentNode = queue.removeLast();
            System.out.print(currentNode.data + " ");
            
            // if currentNode has children, add them to the end of the queue
            if (currentNode.left != null) {
                queue.addFirst(currentNode.left);
            }
            
            if (currentNode.right != null) {
                queue.addFirst(currentNode.right);
            }
        }
        

      
    }
