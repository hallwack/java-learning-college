import java.util.Scanner;

public class HitungPangkat {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    int x, y;

    System.out.print("Masukkan bilangan yang ingin dipangkatkan : ");
    x = inputUser.nextInt();

    System.out.print("Masukkan bilangan pangkatnya : ");
    y = inputUser.nextInt();

    System.out.println(x +"^"+ y +" = "+ pangkatRekursif(x, y));

    inputUser.close();
  }

  static int pangkatRekursif(int x, int y) {
    if (y == 0) {
      return 1;
    } else {
      return x * pangkatRekursif(x, y-1);
    }
  }
}
