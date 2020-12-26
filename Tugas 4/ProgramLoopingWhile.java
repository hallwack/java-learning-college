import java.util.Scanner;

public class ProgramLoopingWhile {
  public static void main(String[] args) {
    int n;
    int i;
    int j;
    
    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan n : ");
    n = inputUser.nextInt();

    i = 1;

    while (i <= n) {
      j = 1;
      while (j <= i) {
        System.out.print("* ");
        j++;
      }
      i++;
      System.out.println();
    }

    inputUser.close();
  }
}
