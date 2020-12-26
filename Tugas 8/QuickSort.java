public class QuickSort {
  int partition(int array[], int batasBawah, int batasAtas) {
    int pivot = array[batasAtas];
    int i = (batasBawah - 1);
    for (int j = batasBawah; j < batasAtas; j++) {
      if (array[j] < pivot) {
        i++;

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
      }
    }

    int temp = array[i + 1];
    array[i + 1] = array[batasAtas];
    array[batasAtas] = temp;

    return i + 1;
  }

  void sort(int array[], int batasBawah, int batasAtas) {
    if (batasBawah < batasAtas) {
      int pi = partition(array, batasBawah, batasAtas);

      sort(array, batasBawah, pi - 1);
      sort(array, pi + 1, batasAtas);
    }
  }

  static void printArray(int array[]) {
    int n = array.length;
    for (int i = 0; i < n; i++) {
      System.out.print(array[i] +" ");
    }
    System.out.println();
  }

  public static void main(String[] args) {
    int array[] = {10, 9, 8, 6, 7, 5, 18, 4, 82, 3, 2, 1};
    int n = array.length;

    QuickSort ob = new QuickSort();
    ob.sort(array, 0, n - 1);

    System.out.println("Sorted Array");
    printArray(array);
  }

}
