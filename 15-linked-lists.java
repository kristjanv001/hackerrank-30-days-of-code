    public static Node insert(Node head, int data) { 
      
        // we create a new node
        Node newNode = new Node(data);
        // we create a currentNode variable so we can keep track of where we're at
        // we set it to the head, as we want to start from the beginning
        Node currentNode = head;
        // if the head is null (the list is empty), well then awesome, we set our newly created node as the head
        if (head == null) {
            head = newNode;
          // else, the head is not null, which means we already have a head (and maybe some other nodes too)
        } else {
            // so we need to traverse the list to find an empty slot to put our freshly baked node
            // if the next node is null (we're at the last stop), we want to break out of the loop - no need to traverse anymore
            while (currentNode.next != null) {
                // this is how we traverse the list: we keep setting the currentNode to be equal to its next - adjacent node 
                // until the condition above is no longer true
                currentNode = currentNode.next;
            }
            // yay, we found an empty slot, so we point the node we're currently at to our newNode
            // it reads like english: currentNode's next node is newNode
            currentNode.next = newNode;
        }
        // just returning the head - only necessary to pass the challenge or if you want to chain additional commands
        return head;  
    }
