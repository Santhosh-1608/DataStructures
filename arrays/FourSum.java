package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:
// 0 <= a, b, c, d < n
// a, b, c, and d are distinct.
// nums[a] + nums[b] + nums[c] + nums[d] == target
// You may return the answer in any order.
public class FourSum {
        public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        int n  = nums.length;
        
        Arrays.sort(nums);
        for(int i= 0;i<n;i++){
            if(i > 0 && nums[i]==nums[i-1]) continue;
            for(int j = i+1;j<n;j++){
                if(j>i+1 && nums[j] == nums[j-1]) continue;
                    int k = j+1;
                    int l = n-1;
                    while(k<l){
                        long sum = nums[i];
                        sum+=nums[j];
                        sum+=nums[k];
                        sum+=nums[l];
                        if(sum==target) {
                            List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);
                            ans.add(temp);
                            k++;
                            l--;
                            while(k<l && nums[k]==nums[k-1]) k++;
                            while(k<l && nums[l]==nums[l+1]) l--;
                        }
                        else if(sum < target){
                            k++;
                        }
                        else{
                            l--;
                        }
                    }
                
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr ={2,2,2,2,2};
        System.out.println(fourSum(arr, 8)); // [[2, 2, 2, 2]]
    }
}
