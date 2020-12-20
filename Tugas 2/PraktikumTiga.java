import java.util.Scanner;
import java.lang.Math;

public class PraktikumTiga {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    int a, b, c;
    double d, x1, x2;

    System.out.println("Masukkan nilai a : ");
    a = inputUser.nextInt();

    System.out.println("Masukkan nilai b : ");
    b = inputUser.nextInt();

    System.out.println("Masukkan nilai c : ");
    c = inputUser.nextInt();

    d = (b * b) - 4 * a * c;

    if (d < 0 ) {
      System.out.println("Persamaan kuadrat dari nilai-nilai diatas didapat akar imajiner");
    } else if (d == 0) {
      x1 = -b / (2 * a);
      System.out.println("Persamaan kuadrat untuk nilai-nilai diatas adalah x1 = "+ x1 +" dan x2 = "+x1);
    } else if (d > 0) {
      x1 = (-b + Math.sqrt(d)) / (2 * a);
      x2 = (-b - Math.sqrt(d)) / (2 * a);
      System.out.println("Persamaan kuadrat untuk nilai-nilai diatas adalah x1 = "+ x1 +" dan x2 = "+ x2);
    }

    inputUser.close();
  }
}
