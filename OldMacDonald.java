import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Cow {
  public void moo(){
    System.out.println("Cow Says Moo.");
  }
}

class Pig{
  public void oink(){
    System.out.println("Pig say oink.");
  }
}

class Duck {
  public void quack(){
    System.out.println("Duck says quack.");
  }
}

class Fox {
  public void ring() {
    System.out.println("Fox says ring a ding ding ding ding ding");
  }
}

public class OldMacDonald {
  public static void main(String[] args) {

    Cow maudine = new Cow();
    Cow pauline = new Cow();
    maudine.moo();
    pauline.moo();

    Pig snowball = new Pig();
    snowball.oink();
    snowball.oink();

    Duck ferdinand = new Duck();
    ferdinand.quack();

    Fox mister = new Fox();
    mister.ring();
  }
}
