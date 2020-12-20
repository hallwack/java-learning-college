public class PercobaanTiga {
  public static void main(String[] args) {
    boolean b;

    b = false;
    System.out.println("b adalah "+ b);
    
    b = true;
    System.out.println("b adalah "+ b);

    // Nilai boolean dapat mengendalikan pernyataan if
    if (b) {
      System.out.println("Pernyataan ini dieksekusi");
    }

    b = false;
    if (b) {
      System.out.println("Pernyataan ini tidak dieksekusi");
    }

    // Hasil dari operator rasional
    System.out.println("10 > 7 adalah "+ (10 > 9));
  }
}
