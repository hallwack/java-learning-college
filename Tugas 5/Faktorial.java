import java.util.Scanner;

public class Faktorial {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    int bil;
    int hasil;

    System.out.println("Menghitung Faktorial");
    System.out.println("====================");
    System.out.print("Masukkan bilangan : ");
    bil = inputUser.nextInt();

    hasil = faktor(bil);

    System.out.println("Faktorial dari "+ bil +" adalah "+ hasil);

    inputUser.close();
  }

  static int faktor(int a) {
    if (a == 1) {
      return (a);
    } else {
      return (a * faktor(a-1));
    }
  }
}
