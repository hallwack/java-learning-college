class MethodOverloading {
  void demo (int a) {
    System.out.println("a : "+ a);
  }

  void demo (int a, int b) {
    System.out.println("a and b : "+ a +", "+ b);
  }

  double demo (double a) {
    System.out.println("double a : "+ a);
    return a * a;
  }
}


public class Overload {

  public static void main(String[] args) {
    MethodOverloading object = new MethodOverloading();
    double result;

    object.demo(10);
    object.demo(10, 20);

    result = object.demo(5.5);

    System.out.println("O/P : "+ result);
  }
}