import java.util.Scanner;

public class LinearSearch {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int c, n, search, array[];

    System.out.print("Masukkan banyak bilangan yang ingin dimasukkan :");
    n = in.nextInt();

    array = new int[n];

    System.out.println("Masukkan bilangan ke-"+ n +" : ");
    for (c = 0; c < n; c++) {
      array[c] = in.nextInt();
    }

    System.out.print("Masukkan angka yang ingin dicari : ");
    search = in.nextInt();

    for (c = 0; c < n; c++) {
      if (array[c] == search) {
        System.out.println("Angka "+ search +" ditemukan di "+ (c + 1) +" .");
        break;
      }
    }
    if (c == n) {
      System.out.println("Angka "+ search +" tidak ditemukan");
    }
  }
}
