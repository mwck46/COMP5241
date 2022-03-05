/* Point of interest
1) static variable is shared by all instances
*/

package edu.polyu.comp5341;

class Circle{
  double radius;
  static int count = 0;

  public Circle(){
    radius = 5;
    count += 1;
  }
  public double getArea(){
    double area = 3.1415 * radius * radius;
    return area;
  }
}

public class TestCircle {
  public static void main( String[] args )
  {
    Circle c1 = new Circle();
    double area = c1.getArea();
    System.out.println( "Circle Area is " + area);
    System.out.println( "Ccount = " + Circle.count);

    Circle c2 = new Circle();
    System.out.println( "Circle Area is " + c2.getArea());
    System.out.println( "Ccount = " + c2.count);

  }
}
