import java.util.Scanner;

public class ProgramDeretFibonacci {
  public static void main(String[] args) {
    int n1 = 0;
    int n2 = 1;
    int n3;
    int banyak;

    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan banyak deret : ");
    banyak = inputUser.nextInt();

    System.out.print(n1 + " "+ n2);

    for (int i = 2; i < banyak; ++i) {
      n3 = n1 + n2;
      System.out.print(" "+ n3);
      n1 = n2;
      n2 = n3;
    }

    inputUser.close();
  }
}
