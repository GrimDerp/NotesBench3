import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WorkingWithObjects {
  public static void main(String[] args) throws Exception {

    File f = new File("datafiles/phonetic-alphabet.txt");
      if ( f.exists() == false ) {
        System.out.println( f.getName() + " not found in this folder. :(");
        System.exit(1);
    }
    ArrayList<String> words = new ArrayList<String>();

    Scanner alpha = new Scanner(f);

    System.out.print("Reading words from \"" + f.getPath() + "\"... ");
    while ( alpha.hasNext() ) {
      String w = alpha.next();
      words.add(w);
    }

    alpha.close();
    System.out.print("done.\n\t");

    Random rng = new Random();
    rng.setSeed(12345);
    //rng.setSeed(23213);   Array Inventory = new Array[<>, <>, 1,2,3,5,8,... ]
                              // on keyboard, accept io in

    }

      for (int n=0; n<3; n++) {
        int i = rng.nextInt( words.size() );
        String s = words.get(i);
        System.out.print( s.toLowerCase() + " " );
      }
      System.out.println();
  }
}
