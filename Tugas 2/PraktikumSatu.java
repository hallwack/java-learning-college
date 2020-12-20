import java.util.Scanner;

public class PraktikumSatu {

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    int tahun;

    System.out.println("Masukkan Tahun : ");
    tahun = inputUser.nextInt();

    if (tahun%400 == 0) {
      System.out.println(tahun +" merupakan Tahun Kabisat");
    } else if (tahun%100 == 0) {
      System.out.println(tahun +" bukan Tahun Kabisat");
    } else if (tahun%4 == 0) {
      System.out.println(tahun +" merupakan Tahun Kabisat");
    } else {
      System.out.println(tahun +" bukan Tahun Kabisat");
    }

    inputUser.close();
  }
}