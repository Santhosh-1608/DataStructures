package sorting;

public class InsertionSort {
    public static int[] sort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && key < arr[j]) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;

        }
        return arr;

    }

    public static void main(String[] args) {
        int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
        int n = arr.length;
        int[] sorted = sort(arr, n);
        System.out.println("Sorted array is");
        for (int i = 0; i < n; i++) {
            System.out.print(sorted[i] + " ");
        }

    }
}
