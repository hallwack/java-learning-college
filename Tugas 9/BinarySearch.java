import java.util.Scanner;

public class BinarySearch {
  
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int c, first, last, middle, n, search;
    int array[];

    System.out.print("Masukkan banyak bilangan yang ingin dimasukkan : ");
    n = in.nextInt();
    
    array = new int[n];

    System.out.print("Masukkan bilangan ke-"+ n +" : ");
    
    for (c = 0; c < n; c++) {
      array[c] = in.nextInt();
    }
    
    System.out.print("Masukkan angka yang ingin dicari : ");
    search = in.nextInt();

    first = 0;
    last = n - 1;
    middle = (first + last) / 2;

    while (first <= last) {
      if (array[middle] < search) {
        first = middle + 1;
      } else if (array[middle] == search) {
        System.out.print("Angka "+ search +" ditemukan di "+ (middle + 1) +".");
        break;
      } else {
        last = middle - 1;
      }
      middle = (first + last) / 2;
    }
    if (first > last) {
      System.out.print("Angka "+ search +" tidak ditemukan.");
    }

    in.close();
  }
}
