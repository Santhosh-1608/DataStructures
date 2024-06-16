package arrays;

// Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.

 
public class MissingNum {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int total  = n*(n+1)/2;
        for(int i = 0;i<n;i++){
            sum+=nums[i];
        }
        return total - sum;
        
    }
    public static void main(String[] args) {
        int nums[] = {0,1,2,4,5};
        System.out.println(missingNumber(nums)); //3
    }
}
