package arrays;
import java.util.*;
public class RotateArrray {
    static void reverse(int[] arr , int start , int end) {
        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void leftRotate(int[] arr, int k ,int n){
        reverse(arr, 0 ,k-1);
        reverse(arr, k, n);
        reverse(arr, 0, n);
    }
    static void RightRotate(int[] arr, int k ,int n){
        
        reverse(arr, n-k+1, n);
        reverse(arr, 0 ,n-k);
        reverse(arr, 0, n);
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int[] arr2 = {-1,-100,3,99};
        int[] arr3 = {34,56,23,78,13,68,90};
        RightRotate(arr, 3, arr.length-1);
        RightRotate(arr2, 2, arr2.length-1);
        leftRotate(arr3,3,arr.length-1);
        System.out.println(Arrays.toString(arr)); // [5, 6, 7, 1, 2, 3, 4]
        System.out.println(Arrays.toString(arr2)); // [3, 99, -1, -100]
        System.out.println(Arrays.toString(arr3)); // [78, 13, 68, 90, 34, 56, 23]
        
    }
}
