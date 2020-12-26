import java.util.Scanner;

public class BilPrimaRekursif {
  static int ambilNilai(int number, int index) {
    if (index == 1) {
      return 1;
    } else if (number % index == 0) {
      return 1 + ambilNilai(number, --index);
    } else {
      return 0 + ambilNilai(number, --index);
    }
  }

  static Boolean cekBilangan(int num) {
    if (num > 1) {
      return (ambilNilai(num, num) == 2);
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    int bil;
    System.out.print("Masukkan bilangan : ");
    bil = inputUser.nextInt();

    if (cekBilangan(bil)) {
      System.out.println(bil + " adalah bilangan prima");
    } else {
      System.out.println(bil + " bukan bilangan prima");
    }

    inputUser.close();
  }
}
