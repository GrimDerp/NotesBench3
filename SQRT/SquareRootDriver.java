import java.util.Scanner;

public class SquareRootDriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double n;

    SquareRootFinder sqrt = new SquareRootFinder();

    do {
      System.out.print("Enter a number, or <=0 to quit: ");
      n = keyboard.nextDouble();

      if ( n > 0 ) {
        sqrt.setNumber(n);
        System.out.println( sqrt.getRoot() );
      }

    } while ( n > 0);
  }
}
