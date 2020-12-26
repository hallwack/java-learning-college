import java.util.Scanner;

public class SearchingStudents {
  
  public static void main(String[] args) {
    Scanner inputInt = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);

    int n, i = 0;
    String search;
    boolean found = false;
    
    System.out.print("Masukkan banyak mahasiswa yang ingin dimasukkan : ");
    n = inputInt.nextInt();
    
    String name[] = new String[n];

    System.out.print("Masukkan daftar nama : ");
    for (i = 0; i < n; i++) {
      name[i] = inputStr.nextLine();
    }

    System.out.print("Masukkan nama yang ingin dicari : ");
    search = inputStr.nextLine();

    for (i = 0; i < n; i++) {
      if (name[i].equals(search)) {
        found = true;
        break;
      }
    }
    
    if (found) {
      System.out.print(search +" telah di temukan di index ke-"+ (i + 1));
    } else {
      System.out.print("Nama "+ search +" tidak ditemukan.");
    }

    inputInt.close();
    inputStr.close();
  }
}
