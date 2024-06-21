package arrays;
 // Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
        public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int i = 0;
        Arrays.sort(nums);
        for(i=0;i<nums.length;i++){
            if(i!=0 && nums[i-1] == nums[i]) continue;
            int j = i+1;
            int k = nums.length - 1;
            while(j<k){
            int sum = nums[i] + nums[j] + nums[k];
            if(sum < 0) {
                j++;
            }
            else if(sum > 0){
                k--;
            }
            else{
                List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k]);
                ans.add(temp);
                j++;
                k--;
                while(j <  k && nums[j] == nums[j-1]) j++;
                while(j< k && nums[k] == nums[k+1]) k--;
            }
         
           
            }
        }
        
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(arr)); // [[-1, -1, 2], [-1, 0, 1]]
    }
}
