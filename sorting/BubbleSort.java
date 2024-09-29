package sorting;

public class BubbleSort {
    public static int[] sort(int[] arr, int n) {
        int flag = 0;
        for (int i = 0; i < n - 1; i++) {
            flag = 0;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = 1;
                }

            }
            if (flag == 0)
                return arr;
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
