import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;




public class SleepynoteDriver {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String y;
    String n;
    //string wont take int as a value at the moment
    //input
    System.out.print("Enter a note: ");
    String note = keyboard.nextLine();

//declare & inst. the object
    Sleepynote slpy = new Sleepynote();

    do {
      System.out.print("save this note for later? ( y/n, '0' to quit)");
    }
    // sfo---ome more stuff here, like http in standard io

    // display
    System.out.println(result);
  }
}
