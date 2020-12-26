public class Animal {
  public void sound() {
    System.out.println("Binatang Bersuara");
  }
}

// Class Horse Java
class Horse extends Animal {
  @Override
  public void sound() {
    System.out.println("Meringkik");
  }

  public static void main(String[] args) {
    Animal object = new Horse();
    object.sound();
  }
}

// Class Cat Java
class Cat extends Animal {
  @Override
  public void sound() {
    System.out.println("Mengeong");
  }

  public static void main(String[] args) {
    Animal object = new Cat();
    object.sound();
  }
}