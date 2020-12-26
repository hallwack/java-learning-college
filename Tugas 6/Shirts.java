import java.util.Scanner;
import java.util.Stack;

public class Shirts {
  public static Scanner scanString = new Scanner(System.in);
  public static Scanner scanInt = new Scanner(System.in);

  public static Stack<Shirt> shirts = new Stack<Shirt>();

  public static void main(String[] args) {
    int menu = 0;
    while (menu != 6) {
      System.out.println("1. Masukkan baju");
      System.out.println("2. Keluarkan baju paling atas");
      System.out.println("3. Keluarkan semua baju");
      System.out.println("4. Lihat baju paling atas");
      System.out.println("5. Lihat semua baju");
      System.out.println("6. Keluar");
      
      System.out.print("Pilih menu : ");
      menu = scanInt.nextInt();

      switch (menu) {
        case 1:
          putInShirt();
          System.out.println("==================================");
          break;
      
        case 2:
          clearShirtOnTop();
          System.out.println("==================================");
          break;
      
        case 3:
          clearAllShirt();
          System.out.println("==================================");
          break;
      
        case 4:
          showShirtOnTop();
          System.out.println("==================================");
          break;
      
        case 5:
          showAllShirt();
          break;
      
        case 6:
          menu = 6;
          break;
      
        default:
          System.out.println("Menu tidak ada");
          break;
      }
    }
  }

  public static void putInShirt() {
    System.out.print("Masukkan ukuran baju : ");
    String size = scanString.nextLine();

    System.out.print("Masukkan merk baju : ");
    String brand = scanString.nextLine();

    System.out.print("Masukkan warna baju : ");
    String color = scanString.nextLine();

    Shirt shirt = new Shirt(size, brand, color);
    shirts.push(shirt);
  }

  public static void clearShirtOnTop() {
    Shirt shirtOnTop = shirts.lastElement();
    
    System.out.println("Baju yang berada di atas adalah : ");
    shirtOnTop.showShirt();
    
    System.out.println("==================================");
    
    shirts.pop();
    System.out.println("Baju dikeluarkan");
    
    System.out.println("==================================");
    
    Shirt shirtOnTopNow = shirts.lastElement();

    System.out.println("Baju yang berada di atas sekarang adalah : ");
    shirtOnTopNow.showShirt();
  }

  public static void clearAllShirt() {
    System.out.println("Mengeluarkan semua baju");
    shirts.clear();
  }

  public static void showShirtOnTop() {
    if (shirts.isEmpty()) {
      System.out.println("Lemari kosong");
    } else {
      Shirt shirtLast = shirts.lastElement();
      shirtLast.showShirt();
    }
  }

  public static void showAllShirt() {
    if (shirts.isEmpty()) {
      System.out.println("Lemari kosong");
    } else {
      System.out.println("Menampilkan semua baju");
      System.out.println("==================================");
      for (Shirt shirt : shirts) {
        shirt.showShirt();
        System.out.println("==================================");
      }
    }
  }
}

/**
* Shirt
 */
class Shirt {
  // Property
  String size;
  String brand;
  String color;

  // Constructor
  Shirt(String size, String brand, String color) {
    this.brand = brand;
    this.color = color;
    this.size = size;
  }

  public void showShirt() {
    System.out.println("Ukuran : "+ this.size);
    System.out.println("Merk : "+ this.brand);
    System.out.println("Warna : "+ this.color);
  }
}
