import java.util.Scanner;

public class Evaluasi {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    // Inisialisasi
    int jumlahLulus = 0;
    int jumlahGagal = 0;
    int counterSiswa = 1;
    int hasil;

    // While Loop
    while (counterSiswa <= 8) {
      System.out.print("Masukkan hasil ujian (1 : Lulus atau 2 : Gagal) : ");
      hasil = input.nextInt();

      // If-Else bersarang di dalam While Loop
      if (hasil == 1) {
        jumlahLulus += 1;
      } else {
        jumlahGagal += 1;
      }

      counterSiswa += 1;
    }

    System.out.println("Lulus : "+ jumlahLulus);
    System.out.println("Gagal : "+ jumlahGagal);

    if (jumlahLulus > 4) {
      System.out.println("Kursus telah berhasil");
    } else {
      System.out.println("Kursus tidak berhasil");
    }

    input.close();
  }
}