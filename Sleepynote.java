
package org.apache.hc.client5.http.examples;
package org.apache.http.examples.nio;


import java.io.File;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.CoutnDownLatch;

import org.apache.hc.client5.http.ClientProtocolException;
import org.apache.hc.client5.http.classic.methods.HttpGet;
import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpResponse;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.HttpStatus;
import org.apache.hc.core5.http.ParseException;
import org.apache.hc.core5.http.io.HttpClientResponseHandler;
import org.apache.hc.core5.http.io.entity.EntityUtils;



public class Sleepynote {
  public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

/**
public class PhraseRepeater ish{
**/
  String phrase;

  int repeats;
  try (CloseableHttpClient httpclient = HttpClients.createDefault()) {
              final HttpGet httpget = new HttpGet("http://httpbin.org/get");

              System.out.println("Executing request " + httpget.getMethod() + " " + httpget.getUri());

              // Create a custom response handler
              final HttpClientResponseHandler<String> responseHandler = new HttpClientResponseHandler<String>() {

                  @Override
                  public String handleResponse(
                          final ClassicHttpResponse response) throws IOException {
                      final int status = response.getCode();
                      if (status >= HttpStatus.SC_SUCCESS && status < HttpStatus.SC_REDIRECTION) {
                          final HttpEntity entity = response.getEntity();
                          try {
                              return entity != null ? EntityUtils.toString(entity) : null;
                          } catch (final ParseException ex) {
                              throw new ClientProtocolException(ex);
                          }
                      } else {
                          throw new ClientProtocolException("Unexpected response status: " + status);
                      }
                  }

              };
              final String responseBody = httpclient.execute(httpget, responseHandler);
              System.out.println("----------------------------------------");
              System.out.println(responseBody);
          }



//setEntity() is from: org.apache.http.client.methods.HttpPost
  /**
  HttpClient httpclient = new defaultHttpClient();
  HttpPost httppost = new HttpPost(url);

  FileBody bin = new FileBody(new File(fileName));
  StringBody comment = new StringBody("Filename" + fileName);

  MultipartEntity reqEntity = new MultipartEntity();
  reqEntity.addPart("bin", bin);
  reqEntity.addPart("comment", comment);
  httppost.setEntity(reqEntity);

  HttpResponse response = httpclient.execute(httppost);
  HttpEntity resEntity = response.getEntity();

**/

/**
  public String getRepeatedPhrase() {
    String result = "";
      for ( int i=0; i<repeats; i++ )
        result += phrase;

          return result;
**/
    //
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
  /**    for ( int i=0; i<repeats; i++ )
        result += phrase;**/
    // display
    System.out.println( note);
  }
}
