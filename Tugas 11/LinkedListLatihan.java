/**
 * LinkedListLatihan
 */
public class LinkedListLatihan {

  
}

/**
 * Node
 */
class Node {

  int data;
  Node next;

  public Node(int data) {
    this.data = data;
  }

  public void show() {
    System.out.print("{"+ data +"}");
  }
}

class LinkedList {
  Node first;

  public LinkedList() {
    first = null;
  }

  public boolean isEmpty() {
    return (first == null);
  }

  public void add(int data) {
    Node node = new Node(data);
    node.next = first;
    first = node;
  }

  public void display() {
    Node current = first;

    if (current == null) {
      System.out.println("Data kosong!");
    } else {
      while (current != null) {
        current.show();
        current = current.next;
      }
      System.out.println();
    }
  }
}