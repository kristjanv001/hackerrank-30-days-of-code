class Difference {
  private int[] elements;
  public int maximumDifference;

    // Add your code here
    Difference(int[] els) {
        this.elements = els;
    }
     
    void computeDifference() {
        Arrays.sort(elements);
        maximumDifference = Math.abs(elements[elements.length-1] - elements[0]);
    }

}
