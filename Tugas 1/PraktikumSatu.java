import java.util.Scanner;

public class PraktikumSatu {
  public static void main(String[] args) {
    String name;
    int nilai;
    String keterangan;
    
    Scanner inputUser = new Scanner(System.in);

    System.out.print("Masukkan Nama : ");
    name = inputUser.nextLine();

    System.out.print("Masukkan Nilai : ");
    nilai = inputUser.nextInt();

    if (nilai >= 60) {
      keterangan = "Lulus";
    } else {
      keterangan = "Tidak Lulus";
    }

    System.out.println("\nNama : "+ name +"\nNilai : "+ nilai +"\nKeterangan : "+ keterangan);

    inputUser.close();
  }
}
