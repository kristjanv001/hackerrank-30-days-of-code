  public static void main(String[] args) {
    /* Enter your code here. Read input from STDIN. 
    Print output to STDOUT. Your class should be named Solution. */

    Scanner scan = new Scanner(System.in);

    int dayReturned = scan.nextInt();
    int monthReturned = scan.nextInt();
    int yearReturned = scan.nextInt();

    int dayDue = scan.nextInt();
    int monthDue = scan.nextInt();
    int yearDue = scan.nextInt();

    int fine = 0;

    if (yearReturned > yearDue) {
        fine = 10000;
    } else if (yearReturned == yearDue && monthReturned > monthDue) {
        fine = 500 * (monthReturned - monthDue);
    } else if (yearReturned == yearDue && monthReturned == monthDue && dayReturned > dayDue) {
        fine = 15 * (dayReturned - dayDue);
    }

    System.out.println(fine);
  }
