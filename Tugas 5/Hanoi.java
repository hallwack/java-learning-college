import java.util.Scanner;

public class Hanoi {
  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.print("Jumlah Piringan : ");
    int N = inputUser.nextInt();
    System.out.println();
    hanoi(N, 'a', 'b', 'c');

    inputUser.close();
  }

  static void hanoi(int n, char awal, char temp, char akhir) {
    if (n == 1) {
      System.out.println("Pindahkan "+ n +" dari "+ awal +" ke "+ akhir);
    } else {
      hanoi(n-1, awal, akhir, temp);
      System.out.println("Pindahkan "+ n +" dari "+ awal +" ke "+ akhir);
      hanoi(n-1, temp, awal, akhir);
    }
  }
}
