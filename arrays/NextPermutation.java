package arrays;
// A permutation of an array of integers is an arrangement of its members into a sequence or linear order.
// For example, for arr = [1,2,3], the following are all the permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1], [3,1,2], [3,2,1].
// Given an array of integers nums, find the next permutation of nums.
// The replacement must be in place and use only constant extra memory.
import java.util.Arrays;

public class NextPermutation {
    static void reverse(int arr[] , int start , int end){
        while(start <=end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void swap(int arr[] , int start , int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
    public static void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index==-1) {
            reverse(nums,0,n-1);
            return;
        }
        for(int j=n-1;j>=index;j--){
            if(nums[j] > nums[index]){
                swap(nums,j,index);
                break;
            }
        }
        reverse(nums,index+1,n-1);
        return;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        nextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }
}
