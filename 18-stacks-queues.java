public class Solution {
    // Write your code here.
    
    // https://docs.oracle.com/javase/7/docs/api/java/util/Stack.html
    // Stack<Character> stack = new Stack<>();
    LinkedList<Character> stack = new LinkedList<>();
    LinkedList<Character> queue = new LinkedList<>();
    
    public void pushCharacter(char ch) {
        stack.addFirst(ch);
    }
    
    public char popCharacter() {
        return stack.removeFirst();
    }
    
    public void enqueueCharacter(char ch) {
        queue.add(ch);
    }
    
    public char dequeueCharacter() {
        return queue.remove();
    } 
    
    
// I used the Stack class at first, but then read from the docs that it's better to use the Deque class, 
// but since it's an abstract class and can't be intantiated I decided to just use the LinkedList class
