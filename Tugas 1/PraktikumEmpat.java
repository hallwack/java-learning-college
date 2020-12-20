import java.util.Scanner;

public class PraktikumEmpat {
  public static void main(String[] args) {
    int p, q, x, y;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan nilai X : ");
    x = inputUser.nextInt();

    System.out.print("Masukkan nilai Y : ");
    y = inputUser.nextInt();

    p = x + y;

    if (p >= 0) {
      q = x * y;
    } else {
      q = x / y;
    }

    System.out.println("Hasil Q : "+ q);

    inputUser.close();
  }
}
