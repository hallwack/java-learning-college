// import java.io.*;
import javax.swing.*;

public class PercobaanDelapan {
  public static void main(String[] args) {
    // BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
    String name = "";

    // System.out.println("Silahkan masukkan nama anda : ");

    // try {
    //   name = dataIn.readLine();
    // } catch (IOException e) {
    //   System.out.println("Error!");
    // }
    // System.out.println("Halo "+ name +", anda berhasil membuatnya!");

    name = JOptionPane.showInputDialog("Please enter your name");
    String msg = "Hello "+ name +"!";
    JOptionPane.showMessageDialog(null, msg);
  }
}
