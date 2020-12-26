import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListLatihan {

  public static void main(String[] args) {
    LinkedList<String> students = new LinkedList<>();

    Scanner inputInt = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);

    String name;
    int n;
    int menu = 0;

    System.out.print("Masukkan banyak mahasiswa : ");
    n = inputInt.nextInt();

    while (menu != 4) {
      System.out.println("1. Masukkan nama mahasiswa");
      System.out.println("2. Urutkan nama mahasiswa");
      System.out.println("3. Cari nama mahasiswa");
      System.out.println("4. Keluar");

      System.out.print("Masukkan pilihan : ");
      try {
        menu = inputInt.nextInt();
      } catch (InputMismatchException e) {
        //TODO: handle exception
        System.out.println("Input harus berupa nomor");
        inputInt.next();
      }

      switch (menu) {
        case 1:
          System.out.print("Masukkan nama mahasiswa : ");
          name = inputStr.next();
          students.add(name);
          System.out.println(name +" telah masuk ke dalam list");
          break;
      
        case 2:
          System.out.println("Nama mahasiswa sebelum di sorting");
          for (String student : students) {
            System.out.print(student);
          }
          System.out.println("Nama setelah di sorting");
          break;
      
        case 3:
          
          break;
      
        case 4:
          
          break;
      
        default:
          break;
      }
    }

    inputInt.close();
    inputStr.close();
  }
}