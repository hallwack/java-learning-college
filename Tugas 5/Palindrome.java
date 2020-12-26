import java.util.Scanner;

public class Palindrome {
  static boolean kataPalindrome(String kata) {
    int left = 0;
    int right = kata.length()-1;

    while (left < right) {
      if (kata.charAt(left) != kata.charAt(right)) {
        return false;
      }
      left++;
      right--;
    }
    return true;
  }

  public static void main(String[] args) {
    Scanner inputUser = new Scanner(System.in);

    System.out.println("PALINDROME CHECKER");
    System.out.println("==================");

    System.out.print("Input Kalimat : ");
    String kata2 = inputUser.nextLine();

    if (kataPalindrome(kata2)) {
      System.out.println(kata2 + " adalah Palindrome");
    } else {
      System.out.println(kata2 + " bukan Palindrome");
    }

    inputUser.close();
  }
}
