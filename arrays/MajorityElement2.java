package arrays;

import java.util.ArrayList;
import java.util.List;

// Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.
public class MajorityElement2 {
        public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int count1 = 0;
        int count2 = 0;
        int element1=Integer.MIN_VALUE;
        int element2=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && element2 != nums[i]){
                count1 = 1;
                element1 = nums[i];
            }
            else if(count2==0 && element1 != nums[i]){
                count2 = 1;
                element2 = nums[i];
            }
            else if(element1==nums[i]) count1++;
            else if(element2==nums[i]) count2++;
            else{
                count1--;
                count2--;
            }
            
        }
        int c1 = 0;
        int c2 = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==element1) c1++;
            if(nums[i]==element2) c2++;
          
        }
        if(c1 > Math.floor(nums.length/3)) ans.add(element1);
        if(c2 > Math.floor(nums.length / 3)) ans.add(element2);
        return ans;
        
    }
    public static void main(String[] args) {
        int[] arr = {3,2,3};
        System.out.println(majorityElement(arr)); // [3]
    }
}
