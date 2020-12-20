public class CircleDemo {
  public static final double PHI = 3.14;

  double calcCircumference(double r) {
    return (2 * PHI * r);
  }

  static double calcArea(double r) {
    return (PHI * r * r);
  }

  static void test() {
    CircleDemo t = new CircleDemo();

    double radius = 100;
    System.out.println("Keliling lingkaran berjari-jari "+ radius +" adalah "+ t.calcCircumference(radius));
    System.out.println("Keliling lingkaran berjari-jari "+ radius +" adalah "+ CircleDemo.calcArea(radius));
  }

  public static void main(String[] args) {
    test();
  }
}
