public class CastingVariable {
  public static void main (String[] args) {
    int var_alas = 9;
    int var_tinggi = 5;
    double rumus_luas;

    double alas = (double)var_alas;
    double tinggi = (double)var_tinggi;

    rumus_luas = (alas * tinggi) / 2;

    System.out.println("Luas Segitiga : "+ rumus_luas);
  }
}
