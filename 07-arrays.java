public class Solution {
    
  static public void printArrayRx(int[] array) {
    for(int i = array.length-1; i >= 0; i--) {
      System.out.print(array[i] + " ");
    }
  }

  // Hackerrank's code where they scan the input and create an int array called 'arr'
  // All we have to do, is to create a method to reverse that (above) and call it with 'arr'

  printArrayRx(arr);
}
