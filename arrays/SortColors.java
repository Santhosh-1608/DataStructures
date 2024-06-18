package arrays;

// Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
// We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively
import java.util.Arrays;

public class SortColors {
    static void swap(int arr[] ,int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
public  static void sortColors(int[] nums) {
    
    int low = 0;
    int mid = 0;
    int high = nums.length-1;
    while(mid <=high) {
        if(nums[mid]==0){
            swap(nums ,mid,low);
            low++;
            mid++;
        }
        else if(nums[mid]==1){
            mid++;
        }
        else{
            swap(nums , mid , high);
            high--;
        }
    }
}
public static void main(String[] args) {
    int[] arr = {1,1,0,0,2,1,1,0,0};
    sortColors(arr);
    System.out.println(Arrays.toString(arr)); // [0, 0, 0, 0, 1, 1, 1, 1, 2]
}
}
