class CetakDataTipe {
  
  // Membuat method dengan nama sama tapi berbeda tipe data
  public void CetakData(String Cetak) {
    System.out.println(Cetak);
  }
  public void CetakData(int Cetak) {
    System.out.println(Cetak);
  }
  public void CetakData(double Cetak) {
    System.out.println(Cetak);
  }
  public void CetakData(char Cetak) {
    System.out.println(Cetak);
  }

}

// Membuat Polymorphism Java
public class Polymorphism {
  public static void main(String[] args) {
    CetakDataTipe data = new CetakDataTipe();

    System.out.print("Cetak data tipe String : ");
    data.CetakData("Sumatera");

    System.out.print("Cetak data tipe Integer : ");
    data.CetakData(1989);

    System.out.print("Cetak data tipe Double : ");
    data.CetakData(16.5/2);

    System.out.print("Cetak data tipe Char : ");
    data.CetakData('N');
  }
}
