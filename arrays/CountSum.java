package arrays;
 

// Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
import java.util.HashMap;

public class CountSum {
        public static  int subarraySum(int[] nums, int k) {
        HashMap<Integer , Integer> presum = new HashMap<>();
        int count =  0;
        int sum =0;
        presum.put(0,1);
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            count+=presum.getOrDefault(sum-k,0);
            presum.put(sum,presum.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subarraySum(arr, 3)); // 2
    }
}
