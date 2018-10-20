import java.net.*;
import java.io.*;

public class ServerMachine {

  public static void main(String[] args) {

    if ( args.length == 0) {
      System.out.println("You need to provide a port");
      System.exit(0);
    }
    int port = Integer.valueOf(args[0]);
    System.out.println("Using port " + port + "...");

    try {
          ServerSocket serverSocket = new ServerSocket(port);

          //listen
          System.out.println("Listening for connections...");
          Socket conSocket = serverSocket.accept();
          System.out.println("CONNECTION ESTABLISHED (caps monster!)");
          System.out.print("Client's IP ADDRESS: ");
          System.out.println(conSocket.getLocalAddress());

          System.out.println("Sending message to client...");
          PrintWriter PrintWriter = new PrintWriter(conSocket.getOutputStream());
          PrintWriter.println("<h1>GREETINGS FROM SERVER</h1>");
          PrintWriter.close();
          conSocket.close();
          serverSocket.close();
    }   catch (Exception ex) {
      ex.printStackTrace();
    }

  }
}
