    Stack<Character> stack = new Stack<>();
    LinkedList<Character> queue = new LinkedList<>();
    
    public void pushCharacter(char ch) {
        stack.push(ch);
    }
    
    public char popCharacter() {
        return stack.pop();
    }
    
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    
    public char dequeueCharacter() {
        return queue.remove();
    }
