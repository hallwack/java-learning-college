import java.util.TreeSet;
import java.util.Scanner;

public class TreeSetLatihan {

    public static void main(String[] args) {
        TreeSet<String> array = new TreeSet<String>();

        Scanner inputInt = new Scanner(System.in);
        Scanner inputStr = new Scanner(System.in);

        int n;
        String mhs;
        System.out.print("Masukkan banyak mahasiswa : ");
        n = inputInt.nextInt();
        
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan nama mahasiswa : ");
            mhs = inputStr.nextLine();
            array.add(mhs);
        }

        System.out.println("Nama Mahasiswa : "+ array);

        inputInt.close();
        inputStr.close();
    }
}