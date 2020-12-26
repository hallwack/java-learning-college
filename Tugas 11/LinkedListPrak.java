import java.util.Scanner;

public class LinkedListPrak {
  class Node {
    String data;
    Node next;

    public Node(String data) {
      this.data = data;
      this.next = null;
    }
  }

  public Node first = null;
  public Node last = null;

  public void add(String data) {
    Node node = new Node(data);

    if (first == null) {
      first = node;
      last = node;
    } else {
      last.next = node;
      last = node;
    }
  }

  public void sort() {
    Node current = first;
    Node index = null;
    String temp;

    if (first == null) {
      return;
    } else {
      while (current != null) {
        index = current.next;

        while (index != null) {
          if (current.data.compareTo(index.data) > 0) {
            temp = current.data;
            current.data = index.data;
            index.data = temp;
          }
          index = index.next;
        }
        current = current.next;
      }
    }
  }

  public void show() {
    Node current = first;

    if (first == null) {
      System.out.println("list is empty");
      return;
    }

    while (current != null) {
      System.out.println(current.data + " ");
      current = current.next;
    }

    System.out.println();
  }

  public void search(String data) {
    Node current = first;
    int i = 1;
    boolean flag = false;

    if (first == null) {
      System.out.println("Daftar nama kosong");
    } else {
      while (current != null) {
        if (current.data.equalsIgnoreCase(data)) {
          flag = true;
          break;
        }

        i++;
        current = current.next;
      }
    }
    if (flag == true) {
      System.out.println("Nama berhasil ditemukan di urutan ke-" + i);
    } else {
      System.out.println(i + "tidak ada di dalam daftar!");
    }
  }

  public static void main(String[] args) {
    LinkedListPrak list = new LinkedListPrak();
    Scanner input = new Scanner(System.in);

    System.out.print("Masukan jumlah mahasiswa yang ingin dimasukkan: ");
    int i = input.nextInt();

    System.out.println("Masukkan nama mahasiswa: ");
    input.nextLine();

    while (i > 0) {
      list.add(input.nextLine());
      i--;
    }

    System.out.println();

    System.out.println("Daftar nama yang sebelum diurutkan: ");
    list.show();

    list.sort();
    System.out.println("Daftar nama setelah diurutkan: ");
    list.show();

    System.out.print("Masukan nama yang ingin dicari: ");
    String find = input.nextLine();

    list.search(find);
    input.close();
  }

}