package arrays;

// Given an array nums, return true if the array was originally sorted in non-decreasing order, then rotated some number of positions (including zero). Otherwise, return false.

public class SortAndRotate {
    public  static boolean check(int[] nums) {
        int count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i-1]>nums[i]) count++;
        }
        if(nums[nums.length-1] > nums[0]) count++;
        return count<=1;
    }
    public static void main(String[] args) {
        int arr1[] = {3,4,5,1,2};
        int arr2[] = {2,1,3,4};
        int arr3[] = {1,2,3};
        System.out.println(check(arr1)); // true
        System.out.println(check(arr2)); // false
        System.out.println(check(arr3)); // true
    }
}
