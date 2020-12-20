import java.util.Scanner;

public class PraktikumDua {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    int suhu;

    System.out.println("Masukkan besar suhu");
    suhu = inputUser.nextInt();

    if (suhu < 0) {
      System.out.println("Padat");
    } else if (suhu > 0 && suhu < 100) {
      System.out.println("Cair");
    } else {
      System.out.println("Gas");
    }

    inputUser.close();
  }
}
