import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Antrian {
  private static int ukuran;

  // Mendeklarasikan antrian (queue) yang akan
  // diisi dengan bilangan bulat bertipe integer

  private static Queue<Integer> queue;

  public static void main(String[] args) {
    System.out.print("Berapa banyak antrian yang diinginkan?");
    ukuran = inputData();

    buatQueue();
    bacaData();
    tulisData();
  }

  private static void buatQueue() {
    queue = new LinkedList<Integer>();
  }

  private static int inputData() {
    BufferedReader  bfr = new BufferedReader(new InputStreamReader(System.in));

    String angkaInput = null;

    try {
      angkaInput = bfr.readLine();
    } catch (IOException e) {
      e.printStackTrace(); //TODO: handle exception
    }

    int Data = Integer.valueOf(angkaInput).intValue();
    return Data;

  }

  private static void bacaData() {
    Integer data;

    for (int i = 0; i < ukuran; i++) {
      System.out.print("Data ke-"+ (i+1) +" :");
      // Membaca data dan memasukkannya ke dalam queue
      data = inputData();
      queue.add(data);
    }
    
    // Mendapatka ukuran queue saat ini
    data = queue.size();
    System.out.println("Ukuran antrian sekarang adalah : "+ data);
  }
  
  private static void tulisData() {
    Integer data;
    
    System.out.print("\nUrutan keluar elemen dari antrian : ");
    
    for (int i = 0; i < ukuran; i++) {
      data = queue.remove();
      // Menghapus dan mengeluarkan data dari queue
      System.out.print("Data ke-"+ (i+1) +" :");
      // Menampilkan data yang dihapus
    }

    // Mendapatkan ukuran queue saat ini
    data = queue.size();
    System.out.println("Ukuran antrian sekarang adalah : "+ data);
  }
  
}