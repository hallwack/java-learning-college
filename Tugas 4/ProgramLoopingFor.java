import java.util.Scanner;

public class ProgramLoopingFor {
  public static void main(String[] args) {
    int n;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan n : ");
    n = inputUser.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }

    inputUser.close();
  }
}
