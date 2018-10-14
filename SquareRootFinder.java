public class SquareRootFinder {
  double n;
  int iterations;

  public void setNumber( double number ){
    n = number;
    iterations = 7;
      if ( n < 10 )
        iterations++;
  }

  public double getRoot() {
    if ( n < 0 ) return Double.NaN;
    if ( n== 0 ) return 0;
    double x = n/4;
      for ( int i=0; i<iterations; i++ ) {
        x = (x+(n/x))/2.0;
      }

      return x;
  }
}
