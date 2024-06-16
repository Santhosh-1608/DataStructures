package arrays;
import java.util.*;

public class ArrayEasy {
    public static int getMax(int arr[]) {
        int max = arr[0];
        for(int i = 0;i<arr.length;i++) {
            if(arr[i]>max) max = arr[i];
        }
        return max;
    }
    public static int  getSecondMax(int arr[]) {
        int max = arr[0];
        int smax = -1;
        for(int i = 0;i<arr.length;i++) {
            if(arr[i] > max) {
                smax = max;
                max = arr[i];
            }
            else if(arr[i] > smax && arr[i] !=max) smax = arr[i];
        }
        return smax;
    }
    public static boolean checkSort(int arr[]) {
       
        for(int i = 1;i<arr.length;i++){ 
          if(arr[i-1] > arr[i]) return false;
        }
       return true;

    }
    public static void leftRotate(int arr[]) {
        int temp = arr[arr.length-1];
        for(int i=arr.length-1;i>=1;i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        for(int i=0;i<arr.length;i++) {
            System.out.print(arr[i] + " ");
        } 
    }
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = obj.nextInt();
        }
        System.out.println();
        System.out.println(getMax(arr));
        System.out.println(getSecondMax(arr));
        System.out.println(checkSort(arr));
        leftRotate(arr);
        obj.close();

    }
}
