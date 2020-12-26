import java.util.Scanner;

public class ProgramLoopingDoWhile {
  public static void main(String[] args) {
    int n;
    int i;
    int j;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan n : ");
    n = inputUser.nextInt();

    i = 1;
    do {
      j = 1;
      do {
        System.out.print("* ");
        j++;
      } while (j <= i);
      i++;
      System.out.println();
    } while (i <= n);

    inputUser.close();
  }
}
