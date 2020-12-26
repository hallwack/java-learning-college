import java.util.Scanner;

public class NilaiMahasiswa {
  public static void main(String[] args) {
    int nilai;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan nilai : ");
    nilai = inputUser.nextInt();

    if (nilai > 85) {
      System.out.println("Nilai adalah A");
    } else if (nilai <= 84 && nilai >= 75) {
      System.out.println("Nilai adalah AB");
    } else if (nilai <= 74 && nilai >= 65) {
      System.out.println("Nilai adalah B");
    } else if (nilai <= 64 && nilai >= 50) {
      System.out.println("Nilai adalah BC");
    } else if (nilai <= 49 && nilai >= 35) {
      System.out.println("Nilai adalah C");
    } else if (nilai <= 34 && nilai >= 20) {
      System.out.println("Nilai adalah D");
    } else if (nilai <= 19 && nilai >= 0) {
      System.out.println("Nilai adalah E");
    }

    inputUser.close();
  }
}
