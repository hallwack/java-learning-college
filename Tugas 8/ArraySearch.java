import java.util.Scanner;

public class ArraySearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n, find;
    int z = 0;
    int[] array;
    boolean notFound = true;

    System.out.print("Masukkan data yang ingin dimasukkan : ");
    n = input.nextInt();

    array = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.print("Input angka ke - "+ (i + 1) +" : ");
      array[i] = input.nextInt();
    }

    System.out.print("Masukkan angka yang ingin dicari : ");
    find = input.nextInt();

    for (int i = 0; i < n; i++) {
      if (array[i] == find) {
        notFound = false;
        z = i + 1;
        System.out.println("Data ditemukan di index ke : "+ z);
      }
    }

    if (notFound == true) {
      System.out.println("Data tidak ditemukan");
    }

    input.close();
  }
}
