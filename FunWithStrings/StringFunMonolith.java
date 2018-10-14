import java.util.Scanner;

public class StringFunMonolith {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // input import junit.framework.TestCase;
    System.out.print("Enter a note: ");
    String msg = keyboard.nextLine();

    // do stuff, maybe
    String rev = "";
    for ( int i=msg.length()-1; i>=0; i-- )
      rev += msg.substring(i,i+1);

      //bump import junit.framework.TestCase;
      String lower = rev.toLowerCase();
      String[] words = lower.split(" ");
      String result = "";

        for ( String w : words )
          result += w.substring(0,1).toUpperCase() + w.substring(1);

        // show er off
        System.out.println(result);
  }
}
