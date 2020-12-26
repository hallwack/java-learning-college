import java.util.Scanner;

public class ContohSwitch {
  public static void main(String[] args) {
    int pilih;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan pilihan anda (1-3) : ");
    pilih = inputUser.nextInt();

    switch (pilih) {
      case 1:
        System.out.println("Anda Ganteng B-)");
        break;
      
      case 2:
        System.out.println("Anda lumayan ganteng :)");
        break;

      case 3:
        System.out.println("Anda sedikit ganteng :/");
        break;

      default:
        System.out.println("Anda tidak ganteng, maaf :(");
        break;
    }

    inputUser.close();
  }
}
