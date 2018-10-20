import java.util.Scanner;
//why not *?

public class PhraseRepeaterDriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a note: ");
    String msg = keyboard.nextLine();
    System.out.print("How many? ");
    int n = keyboard.nextInt();
      //todo; test that

    PhraseRepeater pr = new PhraseRepeater();
    pr .setValues(msg, n);
    System.out.println( pr.getRepeatedPhrase() );
  }
}
