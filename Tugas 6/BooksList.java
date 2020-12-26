import java.util.Scanner;
import java.util.Stack;

public class BooksList {
  public static Scanner scan = new Scanner(System.in);
  public static Scanner scanInt = new Scanner(System.in);
  public static Stack<Book> books = new Stack<Book>();

  public static void main(String[] args) {
    int menu = 0;
    
    while (menu != 7) {
      System.out.println("===================================================");
      System.out.println("1. Masukkan Buku");
      System.out.println("2. Keluarkan buku paling atas");
      System.out.println("3. Keluarkan semua buku");
      System.out.println("4. Lihat buku yang berada di atas");
      System.out.println("5. Lihat semua buku");
      System.out.println("6. Cari buku berdasarkan judul");
      System.out.println("7. Keluar");

      System.out.print("Pilih menu : ");
      menu = scanInt.nextInt();

      switch (menu) {
        case 1:
          putBook();
          break;
      
        case 2:
          clearBookOnTop();
          break;
      
        case 3:
          clearAllBook();
          break;
      
        case 4:
          showBookOnTop();
          break;
      
        case 5:
          showAllBook();
          break;
      
        case 6:
          findBookByTitle();
          break;
      
        case 7:
          menu = 7;
          break;
      
        default:
          System.out.println("Menu tidak ada");
          break;
      }
    }

    System.out.println("===================================================");
  }

  public static void putBook() {
    System.out.println("===================================================");

    System.out.print("Masukkan nomor buku : ");
    int number = scanInt.nextInt();

    System.out.print("Masukkan judul buku : ");
    String title = scan.nextLine();

    System.out.print("Masukkan pengarang buku : ");
    String author = scan.nextLine();

    System.out.println("===================================================");

    Book book = new Book(number, title, author);
    books.push(book);
  }

  public static void clearBookOnTop() {
    Book bookOnTop = books.lastElement();

    System.out.println("===================================================");
    
    System.out.println("Buku yang berada di atas adalah : ");
    bookOnTop.showBooks();
    
    books.pop();
    
    Book bookOnTopNow = books.lastElement();
    System.out.println("Buku yang berada di atas sekarang adalah : ");
    bookOnTopNow.showBooks();

    System.out.println("===================================================");
  }

  public static void clearAllBook() {
    System.out.println("===================================================");

    System.out.println("Mengeluarkan semua buku...");
    books.clear();

    System.out.println("===================================================");
  }

  public static void showBookOnTop() {
    if (books.isEmpty()) {
      System.out.println("Perpustakaan kosong");
    } else {
      System.out.println("===================================================");

      Book bookLast = books.lastElement();
      bookLast.showBooks();

      System.out.println("===================================================");
    }
  }

  public static void showAllBook() {
    if (books.isEmpty()) {
      System.out.println("Perpustakaan kosong");
    } else {
      for (Book book : books) {
        book.showBooks();
        System.out.println("===================================================");
      }
    }
  }

  public static void findBookByTitle() {
    System.out.println("===================================================");

    System.out.println("Masukkan judul yang ingin dicari : ");
    String title = scan.nextLine();

    for (Book book : books) {
      if (book.bookTitle.contains(title)) {
        System.out.println("Buku telah ditemukan dengan judul "+ book.bookTitle +" dengan pengarang "+ book.bookAuthor +" dan nomor buku "+ book.bookNumber);
        System.out.println("===================================================");
        break;
      } else {
        System.out.println("Buku tidak ada di perpustakaan");
      }
    }
  }
}

/**
 * Book
 */
class Book {
  // Property
  int bookNumber;
  String bookTitle;
  String bookAuthor;

  // Constructor
  Book(int bookNumber, String bookTitle, String bookAuthor) {
    this.bookNumber = bookNumber;
    this.bookTitle = bookTitle;
    this.bookAuthor = bookAuthor;
  }

  // Show All Books
  public void showBooks() {
    System.out.println("Nomor : "+ this.bookNumber);
    System.out.println("Judul : "+ this.bookTitle);
    System.out.println("Pengarang : "+ this.bookAuthor);
  }
}