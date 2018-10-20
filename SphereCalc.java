//maybe a package
//maybe import some stuff



public class SphereCalc {
    double radius;

    public void setRadius( double r ) {
      radius =r;
    }

    public double getRadius() {
      return radius;
    }

    public double getSurfaceArea() {
      return 4*Math.PI*radius*radius;
    }

    public double getVolume() {
      return 4*Math.PI*Math.pow(radius,3) / 3.0;
    }
}
// kotlin thing that runs and compiles:
/** try /*
for (i in 0..100 step  7) println(i.toString() + " - ");
**/
