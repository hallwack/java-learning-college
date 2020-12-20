import javax.swing.*;

public class PercobaanSembilan {
  public static void main(String[] args) {
    String input = JOptionPane.showInputDialog("Berapa tinggi Menara Pisa?");
    double height = Double.parseDouble(input);
    JOptionPane.showMessageDialog(null, "Tinggi Menara Pisa adalah "+ height+" meter.");
  }
}
