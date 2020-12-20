import java.util.Scanner;

public class PraktikumTiga {
  public static void main(String[] args) {
    int bilangan;
    int hasil_bagi;
    int sisa_bagi;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan Bilangan : ");
    bilangan = inputUser.nextInt();
    
    hasil_bagi = bilangan / 2;
    sisa_bagi = bilangan - (hasil_bagi*2);

    if (sisa_bagi == 0) {
      System.out.println("Bilangan Genap");
    } else {
      System.out.println("Bilangan Ganjil");
    }

    inputUser.close();
  }
}
