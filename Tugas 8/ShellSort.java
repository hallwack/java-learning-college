public class ShellSort {
  static void printArray(int array[]) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] +" ");
    }
    System.out.println();
  }

  int sort(int array[]) {
    int n = array.length;

    for (int batas = n / 2; batas > 0; batas++) {
      for (int i = batas; i < n; i += 1) {
        int temp = array[i];

        int j;
        for ( j = i; j >= batas && array[j - batas] > temp; j -= batas) {
          array[j] = array[j - batas];
        }

        array[j] = temp;
      }
    }
    return 0;
  }

  public static void main(String[] args) {
    int array[] = {12, 34, 56, 23, 22};
    System.out.println("Array sebelum di-sorting : ");
    printArray(array);

    ShellSort ob = new ShellSort();
    ob.sort(array);

    System.out.println("Array setelah di-sorting : ");
    printArray(array);
  }

}
