import java.util.Scanner;

public class StringFunOODriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    //input
    System.out.print("Enter a note: ");
    String msg = keyboard.nextLine();

    StringFunObject sfo = new StringFunObject(); //declare & inst. the object
    sfo.setMessage(msg);
    sfo.reverse();
    sfo.camelCase();

    // display
    System.out.println( sfo.getMessage() );
  }
}
