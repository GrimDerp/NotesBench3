import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class Sleepynote {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

/**
public class PhraseRepeater {
**/
  String phrase;

  int repeats;

  public void setValues( String p, int r ) {
    phrase = p;
    repeats = r;
  }
/**
  public String getRepeatedPhrase() {
    String result = "";
      for ( int i=0; i<repeats; i++ )
        result += phrase;

          return result;
**/
    //string wont take int as a value at the moment
    //input
    System.out.print("Enter a note: ");
    String note = keyboard.nextLine();

//declare & inst. the object
    Sleepynote slpy = new Sleepynote();

    /*8do {
      System.out.print("save this note for later? ( y/n, '0' to quit)");
    }
    // sfo---ome more stuff here, like http in standard io
**/
    String result = "";
    String result = "";
      for ( int i=0; i<repeats; i++ )
        result += phrase;
    // display
    System.out.println( result);
  }
}
