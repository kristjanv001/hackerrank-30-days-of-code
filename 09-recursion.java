// Complete the factorial function below.
static int factorial(int n) {
  if (n > 1) {
    return n * factorial(n-1);
  } else {
      return n;
  }
}
