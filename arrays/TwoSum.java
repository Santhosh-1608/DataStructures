package arrays;

// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
// You may assume that each input would have exactly one solution, and you may not use the same element twice.
// You can return the answer in any order.

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
 public  static int[] twoSum(int[] nums, int target) {
        int val=0;
        int[] res = new int[2];
        HashMap<Integer,Integer> ans = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            val = target-nums[i];
            if(ans.containsKey(val)){
                res[1] = ans.get(val);
                res[0] = i;
                return res;
            }
            ans.put(nums[i],i);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        System.out.println(Arrays.toString(twoSum(arr, 9))); // [1,0]
    }
}
