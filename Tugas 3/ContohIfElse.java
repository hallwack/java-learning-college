import java.util.Scanner;

public class ContohIfElse {
  public static void main(String[] args) {
    int nilai;

    Scanner inputUser = new Scanner(System.in);

    System.out.println("Masukkan Nilai : ");
    nilai = inputUser.nextInt();

    if (nilai > 60) {
      System.out.println("Nilai anda mencukupi untuk melanjutkan mata kuliah berikutnya");
    } else {
      System.out.println("Nilai anda belum mencukupi");
    }

    inputUser.close();
  }
}
