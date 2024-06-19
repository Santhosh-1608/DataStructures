package arrays;

// You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
// You should return the array of nums such that the the array follows the given conditions:
// Every consecutive pair of integers have opposite signs.
// For all integers with the same sign, the order in which they were present in nums is preserved.
// The rearranged array begins with a positive integer.
// Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

import java.util.Arrays;

public class Rearrange {
    public  static int[] rearrangeArray(int[] nums) {
        int[] res = new int[nums.length];
        int pos = 0;
        int neg = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] < 0){
                res[neg] = nums[i];
                neg+=2;
            }
            else{
                res[pos] = nums[i];
                pos+=2;
            }
        }
    return res;
}
    public static void main(String[] args) {
        int[] arr = {3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(arr))); // [3, -2, 1, -5, 2, -4]
    }
}
