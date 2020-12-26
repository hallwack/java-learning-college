import java.util.Scanner;

public class SortingStudents {
  
  public static void main(String[] args) {
    Scanner inputInt = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);
    
    int n;
    String temp;

    System.out.print("Masukkan banyak nama yang ingin dimasukkan : ");
    n = inputInt.nextInt();

    String str[] = new String[n];

    System.out.println("Masukkan nama yang ingin diurutkan : ");
    for (int i = 0; i < n; i++) {
      str[i] = inputStr.nextLine();
    }

    for (int i = 0; i < n; i++) {
      for (int j = i + 1; j < n; j++) {
        if (str[i].compareTo(str[j]) > 0) {
          temp = str[i];
          str[i] = str[j];
          str[j] = temp;
        }
      }
    }

    System.out.println("Daftar nama : ");
    for (int i = 0; i <= n - 1; i++) {
      System.out.print(str[i] +", ");
    }

    inputInt.close();
    inputStr.close();
  }
}
