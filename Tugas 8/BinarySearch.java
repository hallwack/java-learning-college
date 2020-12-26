import java.util.Scanner;

public class BinarySearch {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int angka;

    System.out.println("Binary Search");
    System.out.println("------------------------------------------");

    boolean notFound = true;
    int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] +" ");
    }

    System.out.println();

    System.out.print("Masukkan angka yang ingin dicari : ");
    angka = input.nextInt();

    int batasAtas = array.length - 1;
    int batasBawah = 0;

    while (notFound) {
      int position = (batasAtas + batasBawah) / 2;
      if (array[position] == angka) {
        notFound = false;
        System.out.println("Angka "+ angka +" telah ditemukan");
      } else if (batasBawah > batasAtas) {
        System.out.println("Angka "+ angka +" tidak ditemukan");
        break;
      } else {
        if (array[position] < angka) {
          batasBawah = position + 1;
        } else {
          batasAtas = position - 1;
        }
      }
    }

    input.close();
  }
}